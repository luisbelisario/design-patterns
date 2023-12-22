package org.belisario.criacionais.singleton;

public class Singleton {

    private static volatile Singleton instance;
    // a palavra reservada volatile garante que sempre que essa variavel for acessada
    // para leitura ou escrita, ela será acessada na memória principal e nao será armazenada
    // em cache, isso grante a atomicidade e a visibilidade no decorrer do programa


    public Singleton() {

    }

    public static Singleton getInstance() {
        // a dupla verificação evita a checagem no bloco synchronized a cada nova busca pela instancia
        if (instance == null) {
            synchronized (Singleton.class) {
                // o synchronized garante que apenas uma thread irá acessar esse recurso por vez
                if (instance == null) {
                    // o null check garante que só será criada uma nova instancia se aquela inatcia for nula
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
