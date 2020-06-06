package pattern.decorate;

/**
 * @className Client
 * @description
 * @author huchenfei
 * @date 2019/3/7 18:44
 * @version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        //把美化过的成绩单拿过来
        SchoolReport sr;
        sr = new FouthGradeSchoolReport();
        sr = new HighScoreDecorator(sr);
        sr = new SortDecorator(sr);
        //看成绩单
        sr.report();
        //然后老爸，一看，很开心，就签名了
        sr.sign("老三"); //我叫小三，老爸当然叫老三
        sr.feedback("无");
    }
}
