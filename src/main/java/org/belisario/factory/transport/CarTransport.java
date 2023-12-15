package org.belisario.factory.transport;

import org.belisario.factory.vehicle.Car;

public class CarTransport extends Transport {


    @Override
    public Car createTransport() {
        return new Car();
    }
}
