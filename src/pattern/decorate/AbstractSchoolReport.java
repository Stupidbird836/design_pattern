package pattern.decorate;

/**
 * @author huchenfei
 * @version 1.0
 * @className SchoolReport
 * @description
 * @date 2019/3/7 18:09
 **/
public abstract class AbstractSchoolReport {

    /**
     * 成绩单主要展示的就是你的成绩情况
     */
    public abstract void report();

    /**
     * 成绩单要家长签字，这个是最要命的
     */
    public abstract void sign(String name);

    public abstract void feedback(String content);


}
