package org.belisario.comportamentais.visitor;

public class Company extends Client {

    protected Company(String name, String address, String number) {
        super(name, address, number);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCompany(this);
    }
}
