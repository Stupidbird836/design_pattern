package pattern.decorate;

/**
 * @className Decorate
 * @description
 * @author huchenfei
 * @date 2019/3/7 18:10
 * @version 1.0
 **/
public abstract class Decorate extends SchoolReport {

    protected SchoolReport schoolReport;

    public Decorate(SchoolReport schoolReport) {
        this.schoolReport = schoolReport;
    }

    @Override
    public void report() {
        System.out.println(schoolReport.getClass().getSimpleName());
        this.schoolReport.report();
    }

    @Override
    public void sign(String name) {
        System.out.println(schoolReport.getClass().getSimpleName());
        this.schoolReport.sign(name);
    }

    @Override
    public void feedback(String content) {
        this.schoolReport.feedback(content);
    }
}
