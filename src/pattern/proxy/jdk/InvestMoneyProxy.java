package pattern.proxy.jdk;


/**
 * @author huchenfei
 * @version 1.0
 * @className InvestMoneyProxy
 * @description 投资实现接口
 * @date 2020/7/29 17:38
 **/
public class InvestMoneyProxy implements InvestMoneyInterface {

    private InvestMoneyInterface investMoneyInterface;

    public InvestMoneyProxy(InvestMoneyInterface investMoneyInterface) {
        this.investMoneyInterface = investMoneyInterface;
    }

    @Override
    public void invest() {
        investMoneyInterface.invest();
    }

    @Override
    public void income() {
        investMoneyInterface.income();
    }
}
