package org.belisario.comportamentais.chainofresponsability;

public class Client {

    public static void main(String[] args) {
        Database database = new Database();

        Handler handler = new UserExistsHandler(database)
                .setNextHandler(new ValidPasswordHandler(database))
                .setNextHandler(new RoleCheckerHandler());

        AuthService service = new AuthService(handler);

        service.logIn("admin", "admin_password");
    }
}
