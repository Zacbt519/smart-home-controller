package controllers;

import interfaces.Appliance;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;

public class SmartHomeController {

    /**
     * List of all active appliances
     */
    private final List<Appliance> appliances;

    /**
     * Constructor
     */
    public SmartHomeController(){
        appliances = new ArrayList<>();
    }

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
            app.turnApplianceOff();
        }
    }

    /**
     * Schedules and runs the next update
     */
    public void scheduleUpdate(){
        //Step 1: Turn off all appliances
        turnOffAllAppliances();

        Timer time = new Timer();
        time.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("System has Updated");
            }
        },getNextUpdateDate().getTime());

        turnOnAllAppliances();


    }

    /**
     * Helper method for determining the date of the next update
     * @return A {@code Calendar} with the next update Date and Time
     */
    private Calendar getNextUpdateDate(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.HOUR, 1 );
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        calendar.set(Calendar.YEAR, LocalDateTime.now().getYear());

        LocalDateTime today = LocalDateTime.now();
        if(today.isAfter(LocalDateTime.ofInstant(calendar.toInstant(), ZoneId.systemDefault()))){
            calendar.set(Calendar.YEAR, calendar.get(Calendar.YEAR) + 1);
        }

        return calendar;

    }
}
