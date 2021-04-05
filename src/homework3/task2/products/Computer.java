package homework3.task2.products;

public class Computer extends ElectronicsProduct {
    public Computer(String name, double price, int quantity, AgeRestriction ageRestriction) {
        super(name, price, quantity, ageRestriction);
        setGuaranteePeriod(24);
    }

    @Override
    public double getPrice() {
        if (getQuantity() > 1000) {
            return super.getPrice() * 0.95;
        }
        return getPrice();
    }

    @Override
    public String toString() {
        return super.toString() +
                ", guaranteePeriod= " + getGuaranteePeriod() +
                '}';
    }
}
