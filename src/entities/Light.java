package entities;

import interfaces.Appliance;

public class Light implements Appliance {

    private boolean isApplianceOn;

    @Override
    public void turnApplianceOn() {
        isApplianceOn = true;
    }

    @Override
    public void turnApplicanceOff() {
        isApplianceOn = false;
    }

    @Override
    public boolean isApplianceOn() {
        return isApplianceOn;
    }
}
