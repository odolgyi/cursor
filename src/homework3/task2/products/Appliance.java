package homework3.task2.products;

public class Appliance extends ElectronicsProduct {
    public Appliance(String name, double price, int quantity, AgeRestriction ageRestriction) {
        super(name, price, quantity, ageRestriction);
        setGuaranteePeriod(6);
    }

    @Override
    public double getPrice() {
        if (getQuantity() < 50) {
            return super.getPrice() * 1.05;
        } else {
            return super.getPrice();
        }

    }

    @Override
    public String toString() {
        return super.toString() +
                ", guaranteePeriod= " + getGuaranteePeriod() +
                '}';
    }
}
