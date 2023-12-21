package org.belisario.estruturais.bridge.platform;

public class TwitchTV implements Platform {


    public TwitchTV() {
        configureRMTP();
        System.out.println("TwitchTV: Preparando para iniciar transmissão...");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("Autenticação validada!");
        System.out.println("Configurando RMTP...");
    }

    @Override
    public void authToken() {
        System.out.println("Autenticando na TwitchTV...");
    }
}
