package org.belisario.estruturais.decorator;

public class UppercaseSimpleAddress implements AddressDecorator {

    AddressDecorator addressDecorator;

    public UppercaseSimpleAddress(AddressDecorator addressDecorator) {
        super();
        this.addressDecorator = addressDecorator;
    }

    @Override
    public String prepareAddress(Address address) {
        return addressDecorator.prepareAddress(address).toUpperCase();
    }
}
