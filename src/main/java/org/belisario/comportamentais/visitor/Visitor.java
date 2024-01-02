package org.belisario.comportamentais.visitor;

public interface Visitor {

    void visitBank(Bank bank);
    void visitCompany(Company company);
    void visitResidence(Residence residence);
    void visitRestaurante(Restaurant restaurant);
}
