package org.belisario.comportamentais.chainofresp;

public class AuthService {

    private Handler handler;

    public AuthService(Handler handler) {
        this.handler = handler;
    }

    public boolean logIn(String username, String password) {
        if (handler.handle(username, password)) {
            System.out.println("Login successfull!");
            return true;
        }
        return false;
    }
}
