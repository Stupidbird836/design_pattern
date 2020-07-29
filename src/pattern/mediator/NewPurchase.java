package pattern.mediator;

/**
 * @className NewPurchase
 * @description
 * @author huchenfei
 * @date 2019/3/6 17:58
 * @version 1.0
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
