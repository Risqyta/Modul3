/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan5;

/**
 *
 * @author ASUS
 */
public class Truck {

    //the Truck class has three fields
    public int cadence;
    public int gear;
    public int speed;
    //the Truck class has one constructor

    public Truck(int startCadence, int startGear, int startSpeed) {
        cadence = startCadence;
        gear = startGear;
        speed = startSpeed;
    }

    public void setCandence(int newValue) {
        cadence = newValue;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public void applybrake(int decrement) {
        speed = decrement;
    }

    public void speedUp(int increment) {
        speed = increment;
    }

}
