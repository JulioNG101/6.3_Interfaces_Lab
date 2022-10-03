package edu.sdccd.cisc191;

public class Vehicle {

    String manufacturerName;
    int numMiles;
    int price;
    int numSeats;
    Option[] option;

    public Vehicle(String manufacturerName, int numMiles, int price, int numSeats, Option[] option) {
        this.manufacturerName = manufacturerName;
        this.numMiles = numMiles;
        this.price = price;
        this.numSeats = numSeats;
        this.option = option;
    }
    public String getManufacturerName() {
        return manufacturerName;
    }

    public int getMilesOnVehicle() {
        return numMiles;
    }

    public int getPrice() {
        return price;
    }

    public int getNumberOfSeats() {
        return numSeats;
    }

    public Option[] getOptions() {
        return option;
    }
}