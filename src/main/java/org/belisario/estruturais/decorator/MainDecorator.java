package org.belisario.estruturais.decorator;

public class MainDecorator {

    public static void main(String[] args) {
        Address address = new Address("Rua dos Anzois", "99999999");

        AddressDecorator addressDecorator = new SimpleAddress();
        // addressDecorator = new UppercaseSimpleAddress(addressDecorator);
        addressDecorator = new AddressWithBorder(addressDecorator);

        String myAdress = addressDecorator.prepareAddress(address);
        System.out.println(myAdress);
    }
}
