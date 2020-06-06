package pattern.adapter;

/**
 * @author huchenfei
 * @version 1.0
 * @className Client
 * @description
 * @date 2019/4/17 18:42
 **/
public class Client {

    public static void main(String... args) {
        // 自己人说话
        Chinese chinese = new ChineseImpl();
        chinese.setMean("你好啊");
        chinese.getMean();

        // 外国人说话
        Chinese chinese1 = new TranslateAdapter();
        String englishMean = ((TranslateAdapter) chinese1).getEnglishMean();
        chinese.setMean(englishMean);
        chinese.getMean();

        String frenchMean = ((TranslateAdapter) chinese1).getFrenchMean();
        chinese.setMean(frenchMean);
        chinese.getMean();

        String germanyMean = ((TranslateAdapter) chinese1).getGermanyMean();
        chinese.setMean(germanyMean);
        chinese.getMean();
    }
}
