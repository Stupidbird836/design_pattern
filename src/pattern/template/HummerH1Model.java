package pattern.template;

public class HummerH1Model extends HummerModel {

    protected void alarm() {
        System.out.println("悍马H1鸣笛...");
    }

    protected void engineBoom() {
        System.out.println("悍马H1引擎声音是这样的...");
    }

    protected void start() {
        System.out.println("悍马H1发动...");
    }

    protected void stop() {
        System.out.println("悍马H1停车...");
    }

    protected boolean isAlarm() {
        return true;
    }

}
