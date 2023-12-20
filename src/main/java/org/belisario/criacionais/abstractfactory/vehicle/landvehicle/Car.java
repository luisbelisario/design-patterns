package org.belisario.criacionais.abstractfactory.vehicle.landvehicle;

public class Car implements LandVehicle {


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
