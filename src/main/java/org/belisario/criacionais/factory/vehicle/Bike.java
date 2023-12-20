package org.belisario.criacionais.factory.vehicle;

public class Bike implements Vehicle {


    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando entrega por bicicleta");
    }

    @Override
    public void getCargo() {
        System.out.println("Encomendas empacotadas");
    }
}
