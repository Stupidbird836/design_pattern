package pattern.builder.builders;

import pattern.builder.cars.Car;
import pattern.builder.cars.Type;
import pattern.builder.components.Engine;
import pattern.builder.components.GPSNavigator;
import pattern.builder.components.Transmission;
import pattern.builder.components.TripComputer;

/**
 * @author huchenfei
 * @version 1.0
 * @className CarBuilder
 * @description 汽车构造器
 * @date 2020/7/29 16:13
 **/
public class CarBuilder implements Builder {

    private Type type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
