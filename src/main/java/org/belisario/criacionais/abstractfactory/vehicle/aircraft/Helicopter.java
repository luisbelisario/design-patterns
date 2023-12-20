package org.belisario.criacionais.abstractfactory.vehicle.aircraft;

public class Helicopter implements HelixAircraft {


    @Override
    public void startRoute() {
        checkHelixes();
        getCargo();
        System.out.println("Turbinas e já!");
    }

    @Override
    public void getCargo() {
        System.out.println("Marcha de decolagem!");
    }

    @Override
    public void checkHelixes() {
        System.out.println("Asas batendo!");
    }
}
