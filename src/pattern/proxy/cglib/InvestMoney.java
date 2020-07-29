package pattern.proxy.cglib;


public class InvestMoney{

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

    public void invest() {
        System.out.println(name + "的钱进行了投资");
    }

    public void income() {
        System.out.println(name + "的钱开始有收益了");
    }
}
