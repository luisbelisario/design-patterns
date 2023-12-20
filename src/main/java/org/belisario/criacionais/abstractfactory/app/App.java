package org.belisario.criacionais.abstractfactory.app;

import org.belisario.criacionais.abstractfactory.transport.TransportFactory;
import org.belisario.criacionais.abstractfactory.vehicle.Vehicle;


import java.util.List;

public class App {

    private final List<Vehicle> vehicleList;

    public App(TransportFactory factory) {
        vehicleList = factory.createVehicleList();
    }

    public void runTransport() {
        for (Vehicle v : vehicleList) {
            v.startRoute();
        }
    }

}
