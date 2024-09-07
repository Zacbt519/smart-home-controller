package entities;

import interfaces.Appliance;

public class AirConditioner implements Appliance {

    // "off" to turn off, "on" to turn on
    private String mode;

    @Override
    public void turnApplianceOn() {
        mode = "on";
    }

    @Override
    public void turnApplianceOff() {
        mode = "off";
    }

    @Override
    public boolean isApplianceOn() {
        return mode.equalsIgnoreCase("on");
    }
}
