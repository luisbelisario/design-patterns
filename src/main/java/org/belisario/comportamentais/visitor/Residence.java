package org.belisario.comportamentais.visitor;

public class Residence extends Client {


    protected Residence(String name, String address, String number) {
        super(name, address, number);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitResidence(this);
    }

}
