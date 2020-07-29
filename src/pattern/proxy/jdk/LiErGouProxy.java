package pattern.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LiErGouProxy implements InvocationHandler {

    private Object investMoney;

    public LiErGouProxy(Object investMoney) {
        this.investMoney = investMoney;
    }

    public Object getInvestMoney() {
        return investMoney;
    }

    public LiErGouProxy setInvestMoney(Object investMoney) {
        this.investMoney = investMoney;
        return this;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(investMoney, args);
    }
}
