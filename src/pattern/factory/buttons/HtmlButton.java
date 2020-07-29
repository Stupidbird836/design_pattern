package pattern.factory.buttons;

/**
 * @author huchenfei
 * @version 1.0
 * @className HtmlButton
 * @description Html 页面的 Button 成品
 * @date 2020/7/29 17:32
 **/
public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
