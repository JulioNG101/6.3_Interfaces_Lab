package edu.sdccd.cisc191;

public class HybridCar extends Car implements Chargeable, Combustible{
    private int FuelLevel;
    private int BatteryCharge;



    public HybridCar(String manufacturerName, int numMiles, int price, int numSeats,Option [] option, int numDoors){
        super(manufacturerName, numMiles, price, numSeats, option, numDoors);
    }
    public int getNumberOfDoors() {
        return numDoors;
    }

    public int getFuelLevel(){
        return FuelLevel;
    }
    public void chargeUp(){
        BatteryCharge = 100;
    }
    public int getBatteryCharge(){
        return BatteryCharge;
    }
    public void tankUp(){
        FuelLevel = 100;
    }

}