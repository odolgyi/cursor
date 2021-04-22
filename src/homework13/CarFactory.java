package homework13;

public class CarFactory {

    public Car createCar(CarType type) {
        Car car;

        switch (type) {
            case SEDAN:
                car = new Sedan();
                break;
            case PICKUP:
                car = new Pickup();
                break;
            case HATCHBACK:
                car = new Hatchback();
                break;
            case MINI_TRUCK:
                car = new MiniTruck();
                break;
            default:
                throw new RuntimeException("This car type couldn't be created!");
        }
        return car;
    }
}
