package edu.sdccd.cisc191;

public class PickupTruck extends Vehicle {

    private int cargoCapacity;

    public PickupTruck(String manufacturerName, int numMiles, int price, int numSeats, Option[] option, int cargoCapacity) {
        super(manufacturerName, numMiles, price, numSeats, option);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }
}