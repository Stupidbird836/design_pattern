package mediatorPattern;

/**
 * @ClassName NewPurchase
 * @Description
 * @Author huchenfei
 * @Date 2019/3/6 17:58
 * @Version 1.0
 **/
public class NewPurchase extends AbstractColleague {

    public NewPurchase(AbstractMediator mediator) {
        super(mediator);
    }

    //采购IBM电脑
    public void buyIBMcomputer(int number) {
        super.mediator.execute("purchase.buy", number);
    }

    //不再采购IBM电脑
    public void refuseBuyIBM() {
        System.out.println("不再采购IBM电脑");
    }
}
