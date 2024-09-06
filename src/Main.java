import controllers.SmartHomeController;
import entities.AirConditioner;
import entities.Fan;
import entities.Light;
import interfaces.Appliance;

import java.util.List;

public class Main {


    public static void main(String[] args) {
        SmartHomeController homeController = new SmartHomeController();

        homeController.addAppliance(new Light());
        homeController.addAppliance(new Fan());
        homeController.addAppliance(new AirConditioner());

        homeController.turnOnAllAppliances();

        homeController.scheduleUpdate();
    }
}