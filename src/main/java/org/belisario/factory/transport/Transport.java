package org.belisario.factory.transport;

import org.belisario.factory.vehicle.Vehicle;

public abstract class Transport {

    public void startTransport() {
        Vehicle vehicle = createTransport();
        vehicle.startRoute();
    }

    public abstract Vehicle createTransport();
}
