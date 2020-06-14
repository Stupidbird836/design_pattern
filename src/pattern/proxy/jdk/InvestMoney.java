package pattern.proxy.jdk;

public class InvestMoney implements InvestMoneyInterface {

    public String name = "";

    public InvestMoney(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public InvestMoney setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public void invest() {
        System.out.println(name + "的钱进行了投资");
    }

    @Override
    public void income() {
        System.out.println(name + "的钱开始有收益了");
    }
}
