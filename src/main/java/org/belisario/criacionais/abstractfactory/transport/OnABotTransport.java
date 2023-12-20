package org.belisario.criacionais.abstractfactory.transport;

import org.belisario.criacionais.abstractfactory.vehicle.Vehicle;
import org.belisario.criacionais.abstractfactory.vehicle.aquatic.Aquatic;
import org.belisario.criacionais.abstractfactory.vehicle.aquatic.Boat;

import java.util.ArrayList;
import java.util.List;

public class OnABotTransport implements AquaticTransportFactory {


    @Override
    public Aquatic createTransportAquatic() {
        return new Boat();
    }

    @Override
    public List<Vehicle> createVehicleList() {
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(createTransportAquatic());
        return vehicleList;
    }
}
