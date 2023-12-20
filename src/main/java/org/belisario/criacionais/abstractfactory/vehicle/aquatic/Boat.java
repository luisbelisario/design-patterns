package org.belisario.criacionais.abstractfactory.vehicle.aquatic;

public class Boat implements Aquatic {


    @Override
    public void startRoute() {
        checkAnchors();
        getCargo();
        System.out.println("Iniciando trajeto de barco");
    }

    @Override
    public void getCargo() {
        System.out.println("Empilhando containeres");
    }

    @Override
    public void checkAnchors() {
        System.out.println("Checando âncoras");
    }
}
