package org.belisario.criacionais.factory.vehicle;

public class Car implements Vehicle {


    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando rota com o carro");
    }

    @Override
    public void getCargo() {
        System.out.println("Passageiros a bordo");
    }
}
