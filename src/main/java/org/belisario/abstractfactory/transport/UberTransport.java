package org.belisario.abstractfactory.transport;

import org.belisario.abstractfactory.vehicle.Vehicle;
import org.belisario.abstractfactory.vehicle.aircraft.Aircraft;
import org.belisario.abstractfactory.vehicle.aircraft.Airplane;
import org.belisario.abstractfactory.vehicle.landvehicle.LandVehicle;
import org.belisario.abstractfactory.vehicle.landvehicle.Motorcycle;

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
