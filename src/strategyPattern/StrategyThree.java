package strategyPattern;

/**
 * @ClassName StrategyThree
 * @Description
 * @Author huchenfei
 * @Date 2019/4/17 15:10
 * @Version 1.0
 **/
public class StrategyThree implements Strategy {

    @Override
    public void process() {
        System.out.println("打屁股。。。。");
    }
}
