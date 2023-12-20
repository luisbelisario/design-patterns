package org.belisario.criacionais.abstractfactory.transport;

import org.belisario.criacionais.abstractfactory.vehicle.aircraft.Aircraft;

public interface AircraftTransportFactory extends TransportFactory {

    Aircraft createTransportAircraft();
}
