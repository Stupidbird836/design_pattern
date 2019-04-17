package proxyPattern;

public class LiErGouProxy implements InvestMoneyInterface {

    private InvestMoneyInterface investMoney = null;

    public LiErGouProxy(InvestMoneyInterface investMoney) {
        this.investMoney = investMoney;
    }

    @Override
    public void invest() {
        this.investMoney.invest();
    }

    @Override
    public void income() {
        this.investMoney.invest();
    }
}
