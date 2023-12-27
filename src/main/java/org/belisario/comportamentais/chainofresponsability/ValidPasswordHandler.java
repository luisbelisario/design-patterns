package org.belisario.comportamentais.chainofresponsability;

public class ValidPasswordHandler extends Handler {

    private Database database;

    public ValidPasswordHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(String username, String password) {
        if (!database.isValidPassword(username, password)) {
            return false;
        }
        return this.handleNext(username, password);
    }
}
