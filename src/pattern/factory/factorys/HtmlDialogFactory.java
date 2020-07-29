package pattern.factory.factorys;

import pattern.factory.buttons.Button;
import pattern.factory.buttons.HtmlButton;

/**
 * @author huchenfei
 * @version 1.0
 * @className HtmlDialogFactory
 * @description
 * @date 2020/7/29 17:37
 **/
public class HtmlDialogFactory extends DialogFactory {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
