package pattern.factory.factorys;

import pattern.factory.buttons.Button;

/**
 * @author huchenfei
 * @version 1.0
 * @className DialogFactory
 * @description
 * @date 2020/7/29 17:36
 **/
public abstract class DialogFactory {

    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    /**
     * 创建button
     *
     * @return Button
     */
    public abstract Button createButton();
}
