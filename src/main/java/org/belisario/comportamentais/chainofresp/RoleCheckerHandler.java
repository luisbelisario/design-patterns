package org.belisario.comportamentais.chainofresp;

public class RoleCheckerHandler extends Handler {

    @Override
    public boolean handle(String username, String password) {
        if ("admin".equals(username)) {
            System.out.println("Loading admin page...");
            return this.handleNext(username, password);
        }
        System.out.println("Loading default page...");
        return this.handleNext(username, password);
    }
}
