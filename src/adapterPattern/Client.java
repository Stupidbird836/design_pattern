package adapterPattern;

/**
 * @ClassName Client
 * @Description
 * @Author huchenfei
 * @Date 2019/4/17 18:42
 * @Version 1.0
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
