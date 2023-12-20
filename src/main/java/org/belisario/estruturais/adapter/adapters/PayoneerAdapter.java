package org.belisario.estruturais.adapter.adapters;

import org.belisario.estruturais.adapter.payoneer.Payoneer;
import org.belisario.estruturais.adapter.paypal.IPayPal;

public class PayoneerAdapter implements IPayPal {

    private final Payoneer payoneer;

    public PayoneerAdapter(Payoneer payoneer) {
        this.payoneer = payoneer;
    }

    @Override
    public void payPalPayment() {
        this.payoneer.sendPayment();
    }

    @Override
    public void payPalReceive() {
        this.payoneer.receivePayment();
    }
}
