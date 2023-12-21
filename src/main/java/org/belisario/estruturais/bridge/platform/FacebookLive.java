package org.belisario.estruturais.bridge.platform;

public class FacebookLive implements Platform {


    public FacebookLive() {
        configureRMTP();
        System.out.println("FacebookLive: Preparando para iniciar transmissão...");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("Autenticação validada!");
        System.out.println("Configurando RMTP...");
    }

    @Override
    public void authToken() {
        System.out.println("Autenticando no FacebookLive...");
    }
}
