package pattern.adapter;

/**
 * @className ChineseImpl
 * @description
 * @author huchenfei
 * @date 2019/4/17 18:23
 * @version 1.0
 **/
public class ChineseImpl implements Chinese {

    private String world;

    @Override
    public void setMean(String world) {
        this.world = world;
    }

    @Override
    public String getMean() {
        System.out.println("这句话的意思是" + world);
        return world;
    }
}
