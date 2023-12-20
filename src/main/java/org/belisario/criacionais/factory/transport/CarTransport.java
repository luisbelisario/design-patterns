package org.belisario.criacionais.factory.transport;

import org.belisario.criacionais.factory.vehicle.Car;

public class CarTransport extends Transport {


    @Override
    public Car createTransport() {
        return new Car();
    }
}
