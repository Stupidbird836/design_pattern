package pattern.factory.factorys;

import pattern.factory.buttons.Button;
import pattern.factory.buttons.WindowsButton;

/**
 * @author huchenfei
 * @version 1.0
 * @className WindowsDialogFactory
 * @description
 * @date 2020/7/29 17:37
 **/
public class WindowsDialogFactory extends DialogFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
