package edu.sdccd.cisc191;

public class ElectricCar extends Car implements Chargeable{
    private int BatteryCharge;



    public ElectricCar(String manufacturerName, int numMiles, int price, int numSeats, Option[] option, int numDoors){
        super(manufacturerName, numMiles, price, numSeats, option, numDoors);
    }
    public void chargeUp() {
        BatteryCharge = 100;

    }
    public int getBatteryCharge() {
        return BatteryCharge;
    }
}
