package org.belisario.criacionais.builder.builders;

import org.belisario.criacionais.builder.components.Color;
import org.belisario.criacionais.builder.components.Engine;
import org.belisario.criacionais.builder.components.Traction;
import org.belisario.criacionais.builder.vehicles.Motorcycle;

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
