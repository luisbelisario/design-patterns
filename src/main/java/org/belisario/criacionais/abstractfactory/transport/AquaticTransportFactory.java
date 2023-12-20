package org.belisario.criacionais.abstractfactory.transport;

import org.belisario.criacionais.abstractfactory.vehicle.aquatic.Aquatic;

public interface AquaticTransportFactory extends TransportFactory {

    Aquatic createTransportAquatic();
}
