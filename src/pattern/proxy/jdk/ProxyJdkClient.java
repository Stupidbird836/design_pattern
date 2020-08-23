package pattern.proxy.jdk;

/**
 * @author huchenfei
 * @version 1.0
 * @className ProxyPattern
 * @description 投资实现接口
 * @date 2020/7/29 17:38
 **/
public class ProxyJdkClient {

    public static void main(String... args) {
        OneInvestMoney oneInvestMoney = new OneInvestMoney();
        InvestMoneyProxy investMoneyProxy = new InvestMoneyProxy(oneInvestMoney);
        investMoneyProxy.invest();
        investMoneyProxy.income();

        TwoInvestMoney twoInvestMoney = new TwoInvestMoney();
        InvestMoneyProxy investMoneyProxyTwo = new InvestMoneyProxy(twoInvestMoney);
        investMoneyProxyTwo.invest();
        investMoneyProxyTwo.income();
    }

}
