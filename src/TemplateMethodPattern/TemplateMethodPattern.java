package TemplateMethodPattern;

/**
 * 模版方法模式
 */
public class TemplateMethodPattern {

    public static void main(String[] args) {
        HummerModel h1 = new HummerH1Model();
        h1.run();

        HummerModel h2 = new HummerH2Model();
        h2.run();
    }

}
