package adapterPattern;

/**
 * @ClassName ChineseImpl
 * @Description
 * @Author huchenfei
 * @Date 2019/4/17 18:23
 * @Version 1.0
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
