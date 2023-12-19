package org.belisario.builder.builders;

import org.belisario.builder.components.Color;
import org.belisario.builder.components.Engine;
import org.belisario.builder.components.Traction;

public interface Builder {

    void setEngine(Engine engine);

    void setTraction(Traction traction);

    void setColor(Color color);
}
