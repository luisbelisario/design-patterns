package org.belisario.criacionais.abstractfactory.transport;

import org.belisario.criacionais.abstractfactory.vehicle.landvehicle.LandVehicle;

public interface LandTransportFactory extends TransportFactory {

    LandVehicle createTransportLandVehicle();
}
