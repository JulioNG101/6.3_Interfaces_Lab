package edu.sdccd.cisc191;

public class SportsUtilityVehicle extends Vehicle {

    private int towWeight;

    public SportsUtilityVehicle(String manufacturerName, int numMiles, int price, int numSeats, Option[] option, int towWeight) {
        super(manufacturerName, numMiles, price, numSeats, option);
        this.towWeight = towWeight;
    }
    public int getMaxTowingWeight() {
        return towWeight;
    }
}