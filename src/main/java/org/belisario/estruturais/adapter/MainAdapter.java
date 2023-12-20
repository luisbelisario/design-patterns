package org.belisario.estruturais.adapter;

import org.belisario.estruturais.adapter.adapters.PayoneerAdapter;
import org.belisario.estruturais.adapter.payoneer.Payoneer;
import org.belisario.estruturais.adapter.paypal.IPayPal;

public class MainAdapter {

    public static void main(String[] args) {

        IPayPal payment = new PayoneerAdapter(new Payoneer());

        payment.payPalPayment();
        payment.payPalReceive();

    }
}
