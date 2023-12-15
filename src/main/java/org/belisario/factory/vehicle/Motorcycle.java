package org.belisario.factory.vehicle;

public class Motorcycle implements Vehicle {


    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando entrega por moto");
    }

    @Override
    public void getCargo() {
        System.out.println("Encomendas empacotadas");
    }
}
