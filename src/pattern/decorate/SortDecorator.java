package pattern.decorate;

/**
 * @className SortDecorator
 * @description
 * @author huchenfei
 * @date 2019/3/7 18:35
 * @version 1.0
 **/
public class SortDecorator extends Decorate {

    public SortDecorator(SchoolReport schoolReport) {
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
