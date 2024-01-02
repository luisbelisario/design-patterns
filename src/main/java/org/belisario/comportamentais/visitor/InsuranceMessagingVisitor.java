package org.belisario.comportamentais.visitor;

import java.util.List;

public class InsuranceMessagingVisitor implements Visitor {

    public void sendInsuranceMails(List<Client> clientList) {
        for (Client client : clientList) {
            client.accept(this);
        }
    }


    @Override
    public void visitBank(Bank bank) {
        System.out.println("Bank");
    }

    @Override
    public void visitCompany(Company company) {
        System.out.println("Company");
    }

    @Override
    public void visitResidence(Residence residence) {
        System.out.println("Residence");
    }

    @Override
    public void visitRestaurante(Restaurant restaurant) {
        System.out.println("Restaurant");
    }
}
