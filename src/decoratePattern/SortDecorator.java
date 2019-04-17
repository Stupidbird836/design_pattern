package decoratePattern;

/**
 * @ClassName SortDecorator
 * @Description
 * @Author huchenfei
 * @Date 2019/3/7 18:35
 * @Version 1.0
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
