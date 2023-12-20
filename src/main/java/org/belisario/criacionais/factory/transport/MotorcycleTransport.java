package org.belisario.criacionais.factory.transport;

import org.belisario.criacionais.factory.vehicle.Motorcycle;

public class MotorcycleTransport extends Transport {


    @Override
    public Motorcycle createTransport() {
        return new Motorcycle();
    }
}
