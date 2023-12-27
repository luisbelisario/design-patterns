package org.belisario.comportamentais.command;

public class SwitchCurtainCommand implements Command {

    private Curtain curtain;

    public SwitchCurtainCommand(Curtain curtain) {
        this.curtain = curtain;
    }

    @Override
    public void execute() {
        this.curtain.switchCurtain();
    }
}
