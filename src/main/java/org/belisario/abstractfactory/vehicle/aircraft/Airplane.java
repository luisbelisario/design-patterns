package org.belisario.abstractfactory.vehicle.aircraft;

public class Airplane implements Aircraft {


    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Decolando!");
    }

    @Override
    public void getCargo() {
        System.out.println("Atenção passageiros! Preparar para o embarque!");
    }
}
