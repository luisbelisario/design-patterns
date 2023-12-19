package org.belisario.builder.builders;

import org.belisario.builder.components.Color;
import org.belisario.builder.components.Engine;
import org.belisario.builder.components.Traction;
import org.belisario.builder.vehicles.Car;

public class CarBuilder implements Builder {

    private Engine engine;
    private Traction traction;
    private Color color;


    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTraction(Traction traction) {
        this.traction = traction;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    public Car getResult() {
        return new Car(engine, traction, color);
    }
}
