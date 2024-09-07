package entities;

import interfaces.Appliance;

public class Fan implements Appliance {

    //0 is off, 1 and 2 is on
    private int fanSpeed;

    @Override
    public void turnApplianceOn() {
        fanSpeed = 1;
    }

    @Override
    public void turnApplianceOff() {
        fanSpeed = 0;
    }

    @Override
    public boolean isApplianceOn() {
        return fanSpeed > 0;
    }
}
