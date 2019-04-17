package adapterPattern;

/**
 * @ClassName TranslateAdapter
 * @Description
 * @Author huchenfei
 * @Date 2019/4/17 18:30
 * @Version 1.0
 **/
public class TranslateAdapter extends ForeignImpl implements Chinese {

    private String englishMean = super.getEnglishMean();
    private String frenchMean = super.getFrenchMean();
    private String germanyMean = super.getGermanyMean();

    @Override
    public void setMean(String world) {

    }

    @Override
    public String getMean() {
        return null;
    }

    public String getEnglishMean() {
        System.out.println(englishMean + "假装翻译成中文了");
        return englishMean + "假装翻译成中文了";
    }

    public String getFrenchMean() {
        System.out.println(frenchMean + "假装翻译成中文了");
        return frenchMean + "假装翻译成中文了";
    }

    public String getGermanyMean() {
        System.out.println(germanyMean + "假装翻译成中文了");
        return germanyMean + "假装翻译成中文了";
    }
}
