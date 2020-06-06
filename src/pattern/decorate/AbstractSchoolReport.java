package pattern.decorate;

/**
 * @className SchoolReport
 * @description
 * @author huchenfei
 * @date 2019/3/7 18:09
 * @version 1.0
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
