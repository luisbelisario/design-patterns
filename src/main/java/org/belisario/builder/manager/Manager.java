package org.belisario.builder.manager;

import org.belisario.builder.builders.Builder;
import org.belisario.builder.components.Color;
import org.belisario.builder.components.Engine;
import org.belisario.builder.components.Traction;

public class Manager {

    public void construct2x2BlackCar(Builder builder) {
        builder.setEngine(new Engine(1600));
        builder.setTraction(Traction.TWO_X_TWO);
        builder.setColor(Color.BLACK);
    }

    public void constructWhiteTruck(Builder builder) {
        builder.setEngine(new Engine(32000));
        builder.setTraction(Traction.FOUR_X_FOUR);
        builder.setColor(Color.WHITE);
    }
}
