package decoratePattern;

/**
 * @ClassName HighScoreDecorator
 * @Description
 * @Author huchenfei
 * @Date 2019/3/7 18:34
 * @Version 1.0
 **/
public class HighScoreDecorator extends Decorate {


    public HighScoreDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }

    //我要汇报最高成绩
    public void reportHighScore() {
        System.out.println("这次考试语文最高是75，数学是78，自然是80");
    }

    @Override
    public void report() {
        this.reportHighScore();
        schoolReport.report();
    }
}
