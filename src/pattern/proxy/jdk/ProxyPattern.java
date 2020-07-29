package pattern.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyPattern {
    public static void main(String... args) {
        InvestMoneyInterface zhangsan = new InvestMoney("张三");
        InvocationHandler invocationHandler = new LiErGouProxy(zhangsan);
//        InvestMoneyInterface pattern.proxy = new LiErGouProxy(zhangsan);
//        pattern.proxy.invest();
//        pattern.proxy.income();

        InvestMoneyInterface proxy = (InvestMoneyInterface) Proxy.newProxyInstance(zhangsan.getClass().getClassLoader(),
                zhangsan.getClass().getInterfaces(), invocationHandler);

        proxy.invest();
        proxy.income();
    }
}
