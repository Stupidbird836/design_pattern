package pattern.builder;

import pattern.builder.builders.CarBuilder;
import pattern.builder.builders.CarManualBuilder;
import pattern.builder.cars.Car;
import pattern.builder.cars.Manual;
import pattern.builder.director.Director;

/**
 * @author huchenfei
 * @version 1.0
 * @className Client
 * @description
 * @date 2020/7/29 16:27
 **/
public class BuilderClient {

    public static void main(String... args) {
        Director director = new Director();

        // 主管控制构造汽车
        CarBuilder carBuilder = new CarBuilder();
        director.constructCityCar(carBuilder);
        Car car = carBuilder.getResult();
        System.out.println("Car built:\n" + car.getType());


        // 主管控制构造汽车手册
        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.constructCityCar(carManualBuilder);
        Manual manual = carManualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + manual.print());


    }
}
