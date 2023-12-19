package org.belisario.abstractfactory.transport;

import org.belisario.abstractfactory.vehicle.aircraft.Aircraft;

public interface AircraftTransportFactory extends TransportFactory {

    Aircraft createTransportAircraft();
}
