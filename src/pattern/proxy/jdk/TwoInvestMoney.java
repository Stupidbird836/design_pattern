package pattern.proxy.jdk;

/**
 * @author huchenfei
 * @version 1.0
 * @className InvestMoneyInterface
 * @description 投资实现接口
 * @date 2020/7/29 17:38
 **/
public class TwoInvestMoney implements InvestMoneyInterface {

    @Override
    public void invest() {
        System.out.println("Two 的钱进行了投资");
    }

    @Override
    public void income() {
        System.out.println("Two 的钱开始有收益了");
    }
}
