package org.belisario.estruturais.decorator;

public class AddressWithBorder implements AddressDecorator {

    AddressDecorator addressDecorator;

    public AddressWithBorder(AddressDecorator addressDecorator) {
        super();
        this.addressDecorator = addressDecorator;
    }

    @Override
    public String prepareAddress(Address address) {
        String preparedAddress = addressDecorator.prepareAddress(address);
        StringBuilder sb = new StringBuilder();
        sb.append("--------------------\n");
        preparedAddress.lines().forEach(l -> sb.append("| " + l + "\n"));
        sb.append("--------------------\n");
        return sb.toString();
    }
}
