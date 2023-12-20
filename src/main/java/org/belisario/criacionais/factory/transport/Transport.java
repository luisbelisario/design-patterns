package org.belisario.criacionais.factory.transport;

import org.belisario.criacionais.factory.vehicle.Vehicle;

public abstract class Transport {

    public void startTransport() {
        Vehicle vehicle = createTransport();
        vehicle.startRoute();
    }

    public abstract Vehicle createTransport();
}
