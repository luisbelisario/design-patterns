package org.belisario.criacionais.abstractfactory.vehicle.landvehicle;

public class Motorcycle implements LandVehicle {


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
