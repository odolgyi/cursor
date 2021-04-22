package homework13.carType;

import homework13.entry.Car;

public class Pickup extends Car {
    public Pickup() {
        construct();
    }

    @Override
    public void construct() {
        System.out.println("Building pickup car");
    }

    @Override
    public String toString() {
        return "Car - pickup";
    }
}