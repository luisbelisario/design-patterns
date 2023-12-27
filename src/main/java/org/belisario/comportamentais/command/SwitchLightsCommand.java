package org.belisario.comportamentais.command;

public class SwitchLightsCommand implements Command {

    private Light light;

    public SwitchLightsCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.switchLight();
    }
}
