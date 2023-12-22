package org.belisario.criacionais.singleton;

public class MainSingleton {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.toString());
        Singleton novoSingleton = Singleton.getInstance();
        System.out.println(novoSingleton.toString());
        Singleton novoSingleton1 = Singleton.getInstance();
        System.out.println(novoSingleton1.toString());
    }
}
