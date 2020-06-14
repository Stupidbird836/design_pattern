package pattern.decorate;

/**
 * @author huchenfei
 * @version 1.0
 * @className SortDecorator
 * @description
 * @date 2019/3/7 18:35
 **/
public class SortDecorator extends AbstractDecorate {

    public SortDecorator(AbstractSchoolReport schoolReport) {
        super(schoolReport);
    }

    public void reportSort() {
        System.out.println("我是排名第38名...");
    }

    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}
