package entities;

import interfaces.Appliance;

public class AirConditioner implements Appliance {

    // "off" to turn off
    private String mode;

    @Override
    public void turnApplianceOn() {
        mode = "on";
    }

    @Override
    public void turnApplicanceOff() {
        mode = "off";
    }

    @Override
    public boolean isApplianceOn() {
        if(mode.equalsIgnoreCase("on")){
            return true;
        } else {
            return false;
        }
    }
}
