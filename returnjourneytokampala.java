/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class returnjourneytokampala {
    public static void main(String[] args) {
        int totalDistance = 10000; 
        int speed = 250; 
        int refuelStopDistance = 200; 
        int stopTime = 5;       
        int refuelStops = totalDistance / refuelStopDistance;
        int totalStopTime = refuelStops * stopTime;
        double travelTime = (double) totalDistance / speed; 
        double totalStopTimeInHours = (double) totalStopTime / 60; 
        double totalTime = travelTime + totalStopTimeInHours;

        System.out.println("Total time for the return journey: " + totalTime + " hours");
    }
}
