package strategyPattern;

/**
 * @ClassName StrategyOne
 * @Description
 * @Author huchenfei
 * @Date 2019/4/17 15:10
 * @Version 1.0
 **/
public class StrategyOne implements Strategy {

    @Override
    public void process() {
        System.out.println("嗲，妖精，还我爷爷。。。");
    }
}
