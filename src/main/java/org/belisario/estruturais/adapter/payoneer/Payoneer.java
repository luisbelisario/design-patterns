package org.belisario.estruturais.adapter.payoneer;

public class Payoneer implements IPayoneer {


    @Override
    public void sendPayment() {
        System.out.println("Pagando pelo Payoneer");
    }

    @Override
    public void receivePayment() {
        System.out.println("Recebendo pelo Payoneer");
    }
}
