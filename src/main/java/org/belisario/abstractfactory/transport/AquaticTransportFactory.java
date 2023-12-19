package org.belisario.abstractfactory.transport;

import org.belisario.abstractfactory.vehicle.aquatic.Aquatic;

public interface AquaticTransportFactory extends TransportFactory {

    Aquatic createTransportAquatic();
}
