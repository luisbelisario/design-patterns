package org.belisario.factory.transport;

import org.belisario.factory.vehicle.Bike;
import org.belisario.factory.vehicle.Vehicle;

public class BikeTransport extends Transport {


    @Override
    public Vehicle createTransport() {
        return new Bike();
    }
}
