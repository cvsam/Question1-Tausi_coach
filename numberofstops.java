/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class numberofstops {
     public static void main(String[] args) {
        int totalDistancetokabale = 10000; 
        int passengerStopDistance = 150; 
        int refuelStopDistance = 200; 

        
        int passengerStops = totalDistancetokabale / passengerStopDistance;
        int refuelStops = totalDistancetokabale / refuelStopDistance;

        System.out.println("Number of passenger stops: " + passengerStops);
        System.out.println("Number of refueling stops: " + refuelStops);
    }
}
    

