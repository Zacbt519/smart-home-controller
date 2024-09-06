package controllers;

import interfaces.Appliance;

import java.util.List;

public class SmartHomeController {

    /**
     * List of all active appliances
     */
    private List<Appliance> appliances;

    /**
     * Adds appliance to the list of currently active appliances
     * @param appliance Appliance to add to the list
     */
    public void addAppliance(Appliance appliance){
        appliances.add(appliance);
    }

    /**
     * Turns on all the appliances currently active in the smart home controller
     */
    public void turnOnAllAppliances(){
        for(Appliance app: appliances){
            app.turnApplianceOn();
        }
    }

    /**
     * Turns off all the appliances currently active in the smart home controller
     */
    public void turnOffAllAppliances(){
        for(Appliance app: appliances){
            app.turnApplicanceOff();
        }
    }

    public void scheduleUpdate(){
        //Step 1: Turn off all appliances
        turnOffAllAppliances();
    }
}
