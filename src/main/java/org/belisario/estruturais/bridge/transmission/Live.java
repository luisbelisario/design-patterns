package org.belisario.estruturais.bridge.transmission;

import org.belisario.estruturais.bridge.platform.Platform;

public class Live implements Transmission {

    protected Platform platform;

    public Live(Platform platform) {
        this.platform = platform;
    }

    @Override
    public void broadcast() {
        System.out.println("Iniciando transmissão...");
    }

    @Override
    public void result() {
        System.out.println("**** NO AR ****");
    }
}
