/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class secondcoach {
    public static void main(String[] args) {
        double totalDistanceKm = 10000; 
        double speedMetersPerSecond = 225.5; 
        //onverting to km/hr
        double speedKmPerHour = (speedMetersPerSecond * 3600) / 1000; 
        
        double travelTimeHours = totalDistanceKm / speedKmPerHour; 
        double startTimeHours = 9.0; 
        double arrivalTimeHours = startTimeHours + travelTimeHours;

        System.out.println("Approximate arrival time: " + arrivalTimeHours + " hours");
    } 
}
