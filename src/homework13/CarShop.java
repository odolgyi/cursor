package homework13;

public class CarShop {
    private final String infoMessage = "Your car is waiting for you";
    private final CarFactory carFactory;
    public CarShop(CarFactory carFactory) {
        this.carFactory = carFactory;
    }

    public Car buyCar(CarType type) {
        messageForTheClient();
        return carFactory.createCar(type);
    }

    private void messageForTheClient() {
        System.out.println(infoMessage);
    }
}