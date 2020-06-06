package pattern.decorate;

/**
 * @author huchenfei
 * @version 1.0
 * @className Client
 * @description 装饰者模式
 * @date 2019/3/7 18:44
 **/
public class Client {

    public static void main(String[] args) {
        //把美化过的成绩单拿过来
        AbstractSchoolReport sr;
        sr = new FouthGradeSchoolReport();
        sr = new HighScoreDecorator(sr);
        sr = new SortDecorator(sr);
        sr.report();
        sr.sign("老三");
        sr.feedback("无");
    }
}
