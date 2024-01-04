package org.belisario.estruturais.decorator;

public class SimpleAddress implements AddressDecorator {

    @Override
    public String prepareAddress(Address address) {
        StringBuilder sb = new StringBuilder();
        sb.append(address.getStreet());
        sb.append("\n");
        sb.append(address.getZipCode());
        return sb.toString();
    }
}
