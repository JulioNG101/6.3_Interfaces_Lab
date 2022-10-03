package edu.sdccd.cisc191;

public class Car extends Vehicle {

    int numDoors;
    public Car(String manufacturerName, int numMiles, int price, int numSeats, Option[] option, int numDoors) {
        super(manufacturerName, numMiles, price, numSeats, option);
        this.numDoors = numDoors;

    }
    public int getNumberOfDoors() {
        return numDoors;
    }
}