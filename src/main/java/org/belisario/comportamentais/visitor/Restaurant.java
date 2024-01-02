package org.belisario.comportamentais.visitor;

public class Restaurant extends Client {

    protected Restaurant(String name, String address, String number) {
        super(name, address, number);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitRestaurante(this);
    }
}
