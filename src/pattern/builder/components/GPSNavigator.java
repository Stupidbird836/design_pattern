package pattern.builder.components;

/**
 * @author huchenfei
 * @version 1.0
 * @className GPSNavigator
 * @description GPS
 * @date 2020/7/29 16:21
 **/
public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}
