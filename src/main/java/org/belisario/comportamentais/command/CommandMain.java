package org.belisario.comportamentais.command;

import java.util.ArrayList;
import java.util.List;

public class CommandMain {

    public static void main(String[] args) {
        Room room = new Room();

        List<Command> commandList = new ArrayList<>();

        commandList.add(new SwitchLightsCommand(new Light()));
        commandList.add(new SwitchCurtainCommand(new Curtain()));

        room.setCommandList(commandList);

        room.executeCommand("SwitchLightsCommand");
        room.executeCommand("SwitchCurtainCommand");

    }
}
