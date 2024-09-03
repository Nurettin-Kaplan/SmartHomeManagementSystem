import jdk.swing.interop.LightweightFrameWrapper;

import java.util.Scanner;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menuChoice, lightChoice, activationChoice, thermostatChoice, securityChoice;
        double temperatureValue;

        System.out.print("\t\tWelcometo Smart Home Management System!");

        do{
            System.out.println("\n\n1-Lighting system entry.");
            System.out.println("2-Temperature system entry.");
            System.out.println("3-Security system entry.");
            System.out.println("4-Exit the program.");
            System.out.print("Enter your choice: ");
            menuChoice = input.nextInt();
            switch (menuChoice){
                case 1:
                    Light light = new Light();
                    System.out.println("\n1-Living Room");
                    System.out.println("2-Bathroom");
                    System.out.println("3-Bedroom");
                    System.out.println("4-Kitchen");
                    System.out.println("5-Light System status");
                    System.out.println("6-Turn off the lighting system.");
                    System.out.print("Enter your choice: ");
                    lightChoice = input.nextInt();

                    System.out.println("\n1- Light activation.");
                    System.out.println("2- Light deactivation.");
                    System.out.print("Enter your choice: ");
                    activationChoice = input.nextInt();

                    if(lightChoice == 1){
                        if (activationChoice == 1){
                            light.TurnOnLivingRoom();
                        }
                        else{
                            light.TurnOffLivingRoom();
                        }
                    }
                    else if (lightChoice == 2){
                        if (activationChoice == 1){
                            light.TurnOnBathroom();
                        }
                        else{
                            light.TurnOffBathroom();
                        }
                    }
                    else if (lightChoice == 3){
                        if (activationChoice == 1){
                            light.TurnOnBedroom();
                        }
                        else{
                            light.TurnOffBedroom();
                        }
                    }
                    else if (lightChoice == 4){
                        if (activationChoice == 1){
                            light.TurnOnKitchen();
                        }
                        else{
                            light.TurnOffKitchen();
                        }
                    }
                    else if(lightChoice == 5){
                        light.isOn();
                    }
                    else if(lightChoice == 6){
                        light.turnOff();
                    }
                    else{
                        System.out.println("Invalid entry.");
                    }
                    break;
                case 2:
                    Thermostat thermostat = new Thermostat();
                    System.out.println("\n1-Change the temperature.");
                    System.out.println("2-Show the temperature.");
                    System.out.println("3-Temperature system status");
                    System.out.println("4-Turn off the temperature system");
                    System.out.print("Enter your choice: ");
                    thermostatChoice = input.nextInt();
                    if(thermostatChoice == 1){
                        System.out.print("Enter the temperature value (°C):");
                        temperatureValue = input.nextDouble();
                        thermostat.setTemperature(temperatureValue);
                    }
                    else if (thermostatChoice == 2){
                        thermostat.getTemperature();
                    }
                    else if(thermostatChoice == 3){
                        thermostat.isOn();
                    }
                    else if(thermostatChoice == 4){
                        thermostat.turnOff();
                    }
                    else{
                        System.out.println("Invalid entry.");
                    }
                    break;
                case 3:
                    SecuritySystem securitySystem = new SecuritySystem();
                    System.out.println("\n1-Set the night alarm");
                    System.out.println("2-Cancel the alarm");
                    System.out.println("3-Turn on all cameras");
                    System.out.println("4-Turn off all cameras");
                    System.out.println("5-Alarm system status");
                    System.out.println("6-Camera system status");
                    System.out.println("7-Security system status");
                    System.out.println("8-Turn off the security system.");
                    System.out.print("Enter your choice: ");
                    securityChoice = input.nextInt();
                    if (securityChoice == 1){
                        securitySystem.setAlarm();
                    }
                    else if(securityChoice == 2){
                        securitySystem.CancelAlarm();
                    }
                    else if(securityChoice == 3){
                        securitySystem.TurnOnCameras();
                    }
                    else if(securityChoice == 4){
                        securitySystem.TurnOffCameras();
                    }
                    else if(securityChoice == 5){
                        securitySystem.isOnAlarm();
                    }
                    else if (securityChoice == 6){
                        securitySystem.areOnCameras();
                    }
                    else if(securityChoice == 7){
                        securitySystem.isOn();
                    }
                    else if(securityChoice == 8){
                        securitySystem.turnOff();
                    }
                    else {
                        System.out.println("Invalid entry.");
                    }
                    break;
                case 4: break;
                default:
                    System.out.println("Invalid entry.");
                    break;
            }
        }while(menuChoice != 4);
    }
}