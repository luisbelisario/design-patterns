package org.belisario.criacionais.builder;

import org.belisario.criacionais.builder.builders.CarBuilder;
import org.belisario.criacionais.builder.manager.Manager;
import org.belisario.criacionais.builder.vehicles.Car;

public class MainBuilder {

    public static void main(String[] args) {

        Manager manager = new Manager();
        CarBuilder carBuilder = new CarBuilder();

        manager.construct2x2BlackCar(carBuilder);

        Car car = carBuilder.getResult();

        System.out.println(car.getVehicleType().toString());
    }
}
