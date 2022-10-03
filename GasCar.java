package edu.sdccd.cisc191;

public class GasCar extends Car implements Combustible{
    private int FuelLevel;
    private int NumberOfDoors;


    public GasCar(String manufacturerName, int milesOnVehicle, int price, int numberOfSeats, Object[] options, int numberOfDoors) {

        super(manufacturerName, milesOnVehicle, price, numberOfSeats, (Option[]) options, numberOfDoors);
        this.NumberOfDoors = numberOfDoors;

    }

    public void tankUp() {
        FuelLevel = 100;
    }

    @Override
    public int getNumberOfDoors() {
        return NumberOfDoors;
    }

    public int getFuelLevel() {
        return FuelLevel;
    }
}