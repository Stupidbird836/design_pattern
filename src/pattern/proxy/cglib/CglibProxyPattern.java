package pattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author huchenfei
 * @version 1.0
 * @date 2020/6/14 18:29
 * @description
 * @className CglibProxyPattern
 */
public class CglibProxyPattern {

    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(InvestMoney.class);
        enhancer.setCallback(cglibProxy);
        InvestMoney investMoney = (InvestMoney) enhancer.create();
        investMoney.setName("张三");
        investMoney.invest();
        investMoney.income();
    }
}
