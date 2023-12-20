package org.belisario.criacionais.builder.vehicles;

import org.belisario.criacionais.builder.components.*;

public class Car {

    private final Engine engine;

    private final Traction traction;

    private final Wheels wheels;

    private final VehicleType vehicleType;

    private final Color color;

    public Car(Engine engine, Traction traction, Color color) {
        this.engine = engine;
        this.traction = traction;
        this.color = color;
        this.wheels = Wheels.FOUR_WHEELS;
        this.vehicleType = VehicleType.CAR;
    }

    public Engine getEngine() {
        return engine;
    }

    public Traction getTraction() {
        return traction;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public Color getColor() {
        return color;
    }
}
