package pattern.factory;

import pattern.factory.factorys.DialogFactory;
import pattern.factory.factorys.HtmlDialogFactory;
import pattern.factory.factorys.WindowsDialogFactory;

/**
 * @author huchenfei
 * @version 1.0
 * @className FactoryClient
 * @description
 * @date 2020/7/29 17:38
 **/
public class FactoryClient {

    private static DialogFactory dialogFactory;

    public static void main(String... args) {
        configure("Windows");
        dialogFactory.renderWindow();
    }

    static void configure(String button) {
        if (button.equals("Windows")) {
            dialogFactory = new WindowsDialogFactory();
        } else {
            dialogFactory = new HtmlDialogFactory();
        }
    }
}
