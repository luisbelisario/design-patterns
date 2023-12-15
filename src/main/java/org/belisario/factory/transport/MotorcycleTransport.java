package org.belisario.factory.transport;

import org.belisario.factory.vehicle.Motorcycle;

public class MotorcycleTransport extends Transport {


    @Override
    public Motorcycle createTransport() {
        return new Motorcycle();
    }
}
