package org.belisario.comportamentais.observer;

public class EmailListener implements EventListener {

    private final String email;


    public EmailListener(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void update(Event event) {
        System.out.println("Enviando notificação por email para o evento " + event.toString() + "para o email " + this.email);
    }
}
