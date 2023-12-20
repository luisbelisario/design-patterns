package org.belisario.criacionais.builder.builders;

import org.belisario.criacionais.builder.components.Color;
import org.belisario.criacionais.builder.components.Engine;
import org.belisario.criacionais.builder.components.Traction;

public interface Builder {

    void setEngine(Engine engine);

    void setTraction(Traction traction);

    void setColor(Color color);
}
