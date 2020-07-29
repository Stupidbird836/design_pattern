package pattern.decorate;

/**
 * @author huchenfei
 * @version 1.0
 * @className HighScoreDecorator
 * @description
 * @date 2019/3/7 18:34
 **/
public class HighScoreDecorator extends AbstractDecorate {


    public HighScoreDecorator(AbstractSchoolReport abstractSchoolReport) {
        super(abstractSchoolReport);
    }

    /**
     * 我要汇报最高成绩
     */
    public void reportHighScore() {
        System.out.println("这次考试语文最高是75，数学是78，自然是80");
    }

    @Override
    public void report() {
        this.reportHighScore();
        abstractSchoolReport.report();
    }
}
