package homework13.carType;

import homework13.entry.Car;

public class Hatchback extends Car {

    public Hatchback() {
        construct();
    }

    public void construct() {
        System.out.println("Building hatchback car");
    }

    @Override
    public String toString() {
        return "Car - Hatchback";
    }
}