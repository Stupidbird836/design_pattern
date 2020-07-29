package pattern.builder.components;

import pattern.builder.cars.Car;

/**
 * @author huchenfei
 * @version 1.0
 * @className TripComputer
 * @description
 * @date 2020/7/29 16:22
 **/
public class TripComputer {
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel());
    }

    public void showStatus() {
        if (this.car.getEngine().isStarted()) {
            System.out.println("Car is started");
        } else {
            System.out.println("Car isn't started");
        }
    }
}
