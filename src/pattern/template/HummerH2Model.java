package pattern.template;


/**
 * @author huchenfei
 */
public class HummerH2Model extends AbstractHummerModel {

//    private HummerH1Model hummerH1Model = print();
//
//    private HummerH1Model print() {
//        System.out.println("aaaa");
//        return new HummerH1Model();
//    }
//
//    public HummerH1Model getHummerH1Model() {
//        return hummerH1Model;
//    }
//
//    public HummerH2Model setHummerH1Model(HummerH1Model hummerH1Model) {
//        this.hummerH1Model = hummerH1Model;
//        return this;
//    }

    public HummerH2Model(HummerH1Model hummerH1Model) {
        System.out.println("a");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马H2鸣笛...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马H2引擎声音是这样的...");
    }

    @Override
    protected void start() {
        System.out.println("悍马H2发动...");
    }

    @Override
    protected void stop() {
        System.out.println("悍马H2停车...");
    }

    @Override
    protected boolean isAlarm() {
        return true;
    }
}
