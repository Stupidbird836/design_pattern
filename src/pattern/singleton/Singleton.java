package pattern.singleton;

/**
 * @author huchenfei
 * @version 1.0
 * @className Singleton1
 * @description
 * @date 2019/8/27 16:04
 **/
public class Singleton {

    private static volatile Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

}
