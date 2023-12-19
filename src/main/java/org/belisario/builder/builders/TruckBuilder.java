package org.belisario.builder.builders;

import org.belisario.builder.components.Color;
import org.belisario.builder.components.Engine;
import org.belisario.builder.components.Traction;
import org.belisario.builder.vehicles.Truck;

public class TruckBuilder implements Builder {

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

    public Truck getResult() {
        return new Truck(engine, traction, color);
    }
}
