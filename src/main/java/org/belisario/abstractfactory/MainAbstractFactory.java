package org.belisario.abstractfactory;

import org.belisario.abstractfactory.app.App;
import org.belisario.abstractfactory.transport.NineNineTransport;
import org.belisario.abstractfactory.transport.OnABotTransport;
import org.belisario.abstractfactory.transport.UberTransport;

public class MainAbstractFactory {

    public static void main(String[] args) {
        App app = new App(new NineNineTransport());
        app.runTransport();
    }
}
