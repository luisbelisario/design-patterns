package org.belisario.builder.vehicles;

import org.belisario.builder.components.*;

public class Motorcycle {

    private final Engine engine;

    private final Traction traction;

    private final Wheels wheels;

    private final VehicleType vehicleType;

    private final Color color;

    public Motorcycle(Engine engine, Traction traction, Color color) {
        this.engine = engine;
        this.traction = traction;
        this.color = color;
        this.wheels = Wheels.TWO_WHEELS;
        this.vehicleType = VehicleType.MOTORCYCLE;
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
