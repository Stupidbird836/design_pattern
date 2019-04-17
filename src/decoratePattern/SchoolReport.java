package decoratePattern;

/**
 * @ClassName SchoolReport
 * @Description
 * @Author huchenfei
 * @Date 2019/3/7 18:09
 * @Version 1.0
 **/
public abstract class SchoolReport {

    //成绩单主要展示的就是你的成绩情况
    public abstract void report();

    //成绩单要家长签字，这个是最要命的
    public abstract void sign(String name);

    public abstract void feedback(String content);


}
