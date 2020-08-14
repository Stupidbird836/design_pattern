package pattern.template;

import java.util.Calendar;
import java.util.Date;

/**
 * 模版方法模式
 * @author huchenfei
 */
public class TemplateMethodPattern {

    public static void main(String[] args) {
        /*HummerH1Model h1 = new HummerH1Model();
        h1.run();*/
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        System.out.println(calendar.get(Calendar.MONTH) + 1 + "月" + calendar.get(Calendar.DAY_OF_MONTH) + "日");
    }

}
