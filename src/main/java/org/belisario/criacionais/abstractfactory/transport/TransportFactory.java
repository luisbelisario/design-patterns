package org.belisario.criacionais.abstractfactory.transport;

import org.belisario.criacionais.abstractfactory.vehicle.Vehicle;

import java.util.List;

public interface TransportFactory {

    List<Vehicle> createVehicleList();
}
