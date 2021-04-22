package homework13.carType;

import homework13.entry.Car;

public class MiniTruck extends Car {
    public MiniTruck() {
        construct();
    }

    public void construct() {
        System.out.println("Building miniTruck car");
    }

    @Override
    public String toString() {
        return "Car - miniTruck";
    }
}