package org.belisario.criacionais.abstractfactory.transport;

import org.belisario.criacionais.abstractfactory.vehicle.Vehicle;
import org.belisario.criacionais.abstractfactory.vehicle.aircraft.Aircraft;
import org.belisario.criacionais.abstractfactory.vehicle.aircraft.Helicopter;
import org.belisario.criacionais.abstractfactory.vehicle.landvehicle.Car;
import org.belisario.criacionais.abstractfactory.vehicle.landvehicle.LandVehicle;

import java.util.ArrayList;
import java.util.List;

public class NineNineTransport implements LandTransportFactory, AircraftTransportFactory {


    @Override
    public LandVehicle createTransportLandVehicle() {
        return new Car();
    }

    @Override
    public Aircraft createTransportAircraft() {
        return new Helicopter();
    }

    @Override
    public List<Vehicle> createVehicleList() {
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(createTransportLandVehicle());
        vehicleList.add(createTransportAircraft());
        return vehicleList;
    }
}
