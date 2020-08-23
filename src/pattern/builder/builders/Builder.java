package pattern.builder.builders;

import pattern.builder.cars.Type;
import pattern.builder.components.Engine;
import pattern.builder.components.GPSNavigator;
import pattern.builder.components.Transmission;
import pattern.builder.components.TripComputer;

/**
 * @author huchenfei
 * @version 1.0
 * @className Builder
 * @description 汽车通用生成器接口
 * @date 2020/7/29 16:06
 **/
public interface Builder {

    /**
     * 汽车类型
     *
     * @param type 汽车类型
     */
    void setType(Type type);

    /**
     * 汽车座位数
     *
     * @param seats 汽车座位数
     */
    void setSeats(int seats);

    /**
     * 汽车引擎
     *
     * @param engine 汽车引擎
     */
    void setEngine(Engine engine);

    /**
     * 汽车变速器
     *
     * @param transmission 汽车变速器
     */
    void setTransmission(Transmission transmission);

    /**
     * 汽车仪表盘
     *
     * @param tripComputer 汽车仪表盘
     */
    void setTripComputer(TripComputer tripComputer);

    /**
     * 汽车GPS
     *
     * @param gpsNavigator 汽车GPS
     */
    void setGPSNavigator(GPSNavigator gpsNavigator);

}
