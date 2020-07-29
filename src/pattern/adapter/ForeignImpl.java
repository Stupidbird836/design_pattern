package pattern.adapter;

/**
 * @className ForeignImpl
 * @description
 * @author huchenfei
 * @date 2019/4/17 19:08
 * @version 1.0
 **/
public class ForeignImpl implements Foreign {

    @Override
    public String getEnglishMean() {
        return "hello";
    }

    @Override
    public String getFrenchMean() {
        return "French hello";
    }

    @Override
    public String getGermanyMean() {
        return "Germany hello";
    }
}
