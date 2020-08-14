package pattern.template;

/**
 * @author huchenfei
 */
public class HummerH1Model extends AbstractHummerModel {

//    private HummerH2Model hummerH2Model;
//
//    public HummerH2Model getHummerH2Model() {
//        return hummerH2Model;
//    }
//
//    public HummerH1Model setHummerH2Model(HummerH2Model hummerH2Model) {
//        this.hummerH2Model = hummerH2Model;
//        return this;
//    }

    public HummerH1Model() {
        System.out.println("b");
    }
//
//    public HummerH1Model(HummerH2Model hummerH2Model) {
//        this.hummerH2Model = hummerH2Model;
//        this.hummerH2Model.alarm();
//    }

    @Override
    protected void alarm() {
        System.out.println("悍马H1鸣笛...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马H1引擎声音是这样的...");
    }

    @Override
    protected void start() {
        System.out.println("悍马H1发动...");
    }

    @Override
    protected void stop() {
        System.out.println("悍马H1停车...");
    }

    @Override
    protected boolean isAlarm() {
        return true;
    }

}
