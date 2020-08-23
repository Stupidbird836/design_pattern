package pattern.template;

/**
 * @author huchenfei
 */
public abstract class AbstractHummerModel {

    /**
     * 发动
     */
    protected abstract void start();

    /**
     * 停车
     */
    protected abstract void stop();

    /**
     * 鸣笛
     */
    protected abstract void alarm();

    /**
     * 引擎
     */
    protected abstract void engineBoom();

    /**
     * 钩子方法，默认喇叭是会响的
     */
    protected boolean isAlarm() {
        return true;
    }

    /**
     * 开车，改为实现方法
     */
    public void run() {
        this.start();
        this.engineBoom();
        if (this.isAlarm()) {
            this.alarm();
        }
        this.stop();
    }
}
