package homework13;

public class Sedan extends Car {
    public Sedan() {
        construct();
    }

    @Override
    public void construct() {
        System.out.println("Building sedan car");
    }

    @Override
    public String toString() {
        return "Car - sedan";
    }
}