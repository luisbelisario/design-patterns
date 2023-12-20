package org.belisario.criacionais.abstractfactory;

import org.belisario.criacionais.abstractfactory.app.App;
import org.belisario.criacionais.abstractfactory.transport.NineNineTransport;

public class MainAbstractFactory {

    public static void main(String[] args) {
        App app = new App(new NineNineTransport());
        app.runTransport();
    }
}
