package org.belisario.estruturais.adapter.paypal;

public class PayPal implements IPayPal {


    @Override
    public void payPalPayment() {
        System.out.println("Pagando através do PayPal");
    }

    @Override
    public void payPalReceive() {
        System.out.println("Recebendo pagamento através do PayPal");
    }
}
