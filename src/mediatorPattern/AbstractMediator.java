package mediatorPattern;

/**
 * @ClassName AbstractMediator
 * @Description
 * @Author huchenfei
 * @Date 2019/3/6 17:53
 * @Version 1.0
 **/
public abstract class AbstractMediator {
    protected NewPurchase purchase;
    protected NewSale sale;
    protected NewStock stock;

    //构造函数
    public AbstractMediator() {
        purchase = new NewPurchase(this);
        sale = new NewSale(this);
        stock = new NewStock(this);
    }

    //中介者最重要的方法叫做事件方法，处理多个对象之间的关系
    public abstract void execute(String str, Object... objects);
}
