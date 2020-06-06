package pattern.strategy;

/**
 * @className Client
 * @description
 * @author huchenfei
 * @date 2019/4/17 15:11
 * @version 1.0
 **/
public class Client {

    public static void main(String... args) {
        Context context = null;
        System.out.println("福禄娃的爷爷被妖精抓走了");
        System.out.println("\n");
        System.out.println("大娃展现神力");
        context = new Context(new StrategyOne());
        context.operate();
        System.out.println("大娃。扑街");
        System.out.println("\n");

        System.out.println("二娃千里眼顺风耳");
        context = new Context(new StrategyTwo());
        context.operate();
        System.out.println("二娃。扑街");
        System.out.println("\n");

        System.out.println("三娃钢筋铁骨");
        context = new Context(new StrategyThree());
        context.operate();
        System.out.println("三娃。扑街");

    }
}
