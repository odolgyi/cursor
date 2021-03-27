package homework2.car;

public class Car {
    private boolean isEngineWork = false;
    private double currentSpeed = 0;
    private boolean cruiseControlStatus = false;
    private double maxSpeed = 90;
    private double speedLimitToEnableCruiseSystem = 40;

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public boolean startEngine() {
        isEngineWork = true;
        System.out.println("Engine is working");
        return isEngineWork;
    }

    public boolean stopEngine() {
        isEngineWork = false;
        currentSpeed = 0;
        System.out.println("Engine was turned off");
        return isEngineWork;
    }

    public void increaseSpeed(int speed) {
        if (isEngineWork && currentSpeed < maxSpeed) {
            currentSpeed += speed;
            System.out.println("Car speed increased to " + currentSpeed);
        } else {
            throw new RuntimeException("Engine car should be turn on.");
        }
    }

    public void decreaseSpeed(int speed) {
        if(currentSpeed!=0) {
            currentSpeed -= speed;
            System.out.println("Current speed is " + currentSpeed);
        }
        else {
            System.out.println("The car stopped");
        }
    }

    public void cruiseControl(boolean status) {
        if (!cruiseControlStatus && status && currentSpeed >= speedLimitToEnableCruiseSystem) {
            cruiseControlStatus = true;
            System.out.println("Cruise control is enabled on speed : " + getCurrentSpeed());
        }
        else if (!status) {
            cruiseControlStatus = false;
            System.out.println("Cruise control is disabled");
        }
    }

}