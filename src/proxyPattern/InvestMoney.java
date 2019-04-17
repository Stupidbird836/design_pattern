package proxyPattern;

public class InvestMoney implements InvestMoneyInterface {

    private String name = "";
    public InvestMoney(String name) {
        this.name = name;
    }

    public void invest() {
        System.out.println(name + "的钱进行了投资");
    }

    public void income() {
        System.out.println(name + "的钱开始有收益了");
    }
}
