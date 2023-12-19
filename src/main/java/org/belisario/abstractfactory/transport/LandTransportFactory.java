package org.belisario.abstractfactory.transport;

import org.belisario.abstractfactory.vehicle.landvehicle.LandVehicle;

public interface LandTransportFactory extends TransportFactory {

    LandVehicle createTransportLandVehicle();
}
