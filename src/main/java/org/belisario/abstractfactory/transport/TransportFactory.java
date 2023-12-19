package org.belisario.abstractfactory.transport;

import org.belisario.abstractfactory.vehicle.Vehicle;

import java.util.List;

public interface TransportFactory {

    List<Vehicle> createVehicleList();
}
