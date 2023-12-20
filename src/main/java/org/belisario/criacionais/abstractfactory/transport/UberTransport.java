package org.belisario.criacionais.abstractfactory.transport;

import org.belisario.criacionais.abstractfactory.vehicle.Vehicle;
import org.belisario.criacionais.abstractfactory.vehicle.aircraft.Aircraft;
import org.belisario.criacionais.abstractfactory.vehicle.aircraft.Airplane;
import org.belisario.criacionais.abstractfactory.vehicle.landvehicle.LandVehicle;
import org.belisario.criacionais.abstractfactory.vehicle.landvehicle.Motorcycle;

import java.util.ArrayList;
import java.util.List;

public class UberTransport implements LandTransportFactory, AircraftTransportFactory {


    @Override
    public LandVehicle createTransportLandVehicle() {
        return new Motorcycle();
    }

    @Override
    public Aircraft createTransportAircraft() {
        return new Airplane();
    }

    @Override
    public List<Vehicle> createVehicleList() {
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(createTransportLandVehicle());
        vehicleList.add(createTransportAircraft());
        return vehicleList;
    }
}
