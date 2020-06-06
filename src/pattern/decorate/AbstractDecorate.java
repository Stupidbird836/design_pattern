package pattern.decorate;

/**
 * @author huchenfei
 * @version 1.0
 * @className Decorate
 * @description
 * @date 2019/3/7 18:10
 **/
public abstract class AbstractDecorate extends AbstractSchoolReport {

    protected AbstractSchoolReport abstractSchoolReport;

    public AbstractDecorate(AbstractSchoolReport schoolReport) {
        this.abstractSchoolReport = schoolReport;
    }

    @Override
    public void report() {
        System.out.println(abstractSchoolReport.getClass().getSimpleName());
        this.abstractSchoolReport.report();
    }

    @Override
    public void sign(String name) {
        System.out.println(abstractSchoolReport.getClass().getSimpleName());
        this.abstractSchoolReport.sign(name);
    }

    @Override
    public void feedback(String content) {
        this.abstractSchoolReport.feedback(content);
    }
}
