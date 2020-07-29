//package pattern.proxy.cglib;
//
//import net.sf.cglib.proxy.MethodInterceptor;
//import net.sf.cglib.proxy.MethodProxy;
//
//import java.lang.reflect.Method;
//
///**
// * @author huchenfei
// * @version 1.0
// * @date 2020/6/14 18:21
// * @description
// * @className CglibProxy
// */
//public class CglibProxy implements MethodInterceptor {
//
//    @Override
//    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
//        System.out.println("++++++before " + methodProxy.getSuperName() + "++++++");
//        System.out.println(method.getName());
//        Object o1 = methodProxy.invokeSuper(o, objects);
//        System.out.println("++++++before " + methodProxy.getSuperName() + "++++++");
//        return o1;
//    }
//}
