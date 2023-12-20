package org.belisario.criacionais.factory.transport;

import org.belisario.criacionais.factory.vehicle.Bike;
import org.belisario.criacionais.factory.vehicle.Vehicle;

public class BikeTransport extends Transport {


    @Override
    public Vehicle createTransport() {
        return new Bike();
    }
}
