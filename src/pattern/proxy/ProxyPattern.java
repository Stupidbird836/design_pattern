package pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyPattern {
    public static void main(String... args) {
        InvestMoneyInterface zhangsan = new InvestMoney("张三");
//        InvestMoneyInterface pattern.proxy = new LiErGouProxy(zhangsan);
//        pattern.proxy.invest();
//        pattern.proxy.income();

        InvestMoneyInterface proxy = (InvestMoneyInterface) Proxy.newProxyInstance(zhangsan.getClass().getClassLoader(),
                zhangsan.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                System.out.println("在 代理对象 中拦截到：" + method.getName());
                return method.invoke(zhangsan, args);
            }
        });

        proxy.invest();
        proxy.income();
    }
}
