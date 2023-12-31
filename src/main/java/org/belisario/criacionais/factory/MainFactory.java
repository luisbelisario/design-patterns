package org.belisario.criacionais.factory;

import org.belisario.criacionais.factory.transport.BikeTransport;
import org.belisario.criacionais.factory.transport.CarTransport;
import org.belisario.criacionais.factory.transport.MotorcycleTransport;
import org.belisario.criacionais.factory.transport.Transport;

public class MainFactory {

    public static Transport transport;

    public static void main(String[] args) {
        configure(args[0]);
        if (transport != null) {
            runTransport();
        }
    }

    private static void runTransport() {
        transport.startTransport();
    }

    private static void configure(String arg) {
        switch (arg) {
            case "uber" -> transport = new CarTransport();
            case "ifood" -> transport = new MotorcycleTransport();
            case "itau" -> transport = new BikeTransport();
            default -> System.out.println("Transporte inválido");
        }
    }


}