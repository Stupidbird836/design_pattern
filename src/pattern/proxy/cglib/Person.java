package pattern.proxy.cglib;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.CyclicBarrier;

/**
 * @author huchenfei
 * @version 1.0
 * @date 2020/6/28 17:24
 * @description
 * @className Person
 */
public class Person implements Runnable {
    private CyclicBarrier barrier;
    private String name;

    public Person(CyclicBarrier barrier, String name) {
        this.barrier = barrier;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
            System.out.println(sdf.format(new Date()) + " " + name + "出发去饭店");
            System.out.println(sdf.format(new Date()) + " " + name + "到了饭店");

            barrier.await();

            System.out.println(sdf.format(new Date()) + " " + name + "开始吃饭");
            System.out.println(sdf.format(new Date()) + " " + name + "吃完了");
            // 重用CyclicBarrier
            barrier.await();

            System.out.println(sdf.format(new Date()) + " " + name + "离开餐厅");
        } catch (Exception e) {

        }
    }
}
