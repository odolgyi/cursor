package homework3.task2.products;

public abstract class ElectronicsProduct extends Product {
    private int guaranteePeriod;

    public ElectronicsProduct(String name, double price, int quantity, AgeRestriction ageRestriction) {
        super(name, price, quantity, ageRestriction);
    }

    public void setGuaranteePeriod(int guaranteeMonth) {
        this.guaranteePeriod = guaranteeMonth;
    }

    public int getGuaranteePeriod() {
        return guaranteePeriod;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", guaranteePeriod= " + guaranteePeriod +
                '}';
    }
}
