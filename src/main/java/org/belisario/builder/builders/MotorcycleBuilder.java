package org.belisario.builder.builders;

import org.belisario.builder.components.Color;
import org.belisario.builder.components.Engine;
import org.belisario.builder.components.Traction;
import org.belisario.builder.vehicles.Motorcycle;

public class MotorcycleBuilder implements Builder {

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

    public Motorcycle getResult() {
        return new Motorcycle(engine, traction, color);
    }
}
