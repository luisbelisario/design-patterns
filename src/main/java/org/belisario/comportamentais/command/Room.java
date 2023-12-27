package org.belisario.comportamentais.command;

import java.util.List;

public class Room {

    private List<Command> commandList;

    public Room() {
    }

    public void setCommandList(List<Command> commandList) {
        this.commandList = commandList;
    }

    public void executeCommand(String className) {
        for (Command c : commandList) {
            if (className.equals(c.getClass().getSimpleName())) {
                c.execute();
            }
        }
    }
}
