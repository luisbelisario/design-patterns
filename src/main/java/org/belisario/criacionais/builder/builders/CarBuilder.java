package org.belisario.criacionais.builder.builders;

import org.belisario.criacionais.builder.components.Color;
import org.belisario.criacionais.builder.components.Engine;
import org.belisario.criacionais.builder.components.Traction;
import org.belisario.criacionais.builder.vehicles.Car;

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
