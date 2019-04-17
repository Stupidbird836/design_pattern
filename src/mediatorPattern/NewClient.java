package mediatorPattern;

/**
 * @ClassName NewClient
 * @Description
 * @Author huchenfei
 * @Date 2019/3/6 18:20
 * @Version 1.0
 **/
public class NewClient {

    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();

        //采购人员采购电脑
        System.out.println("------采购人员采购电脑--------");
        NewPurchase purchase = new NewPurchase(mediator);
        purchase.buyIBMcomputer(100);

        //销售人员销售电脑
        System.out.println("\n------销售人员销售电脑--------");
        NewSale sale = new NewSale(mediator);
        sale.sellIBMComputer(1000);

        //库房管理人员管理库存
        System.out.println("\n------库房管理人员清库处理--------");
        NewStock stock = new NewStock(mediator);
        stock.clearStock();
    }
}
