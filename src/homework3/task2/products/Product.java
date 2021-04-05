package homework3.task2.products;

import homework3.task2.interfaces.Buyable;

public abstract class Product implements Buyable {
    private String name;
    private double price;
    private int quantity;
    private int ageRestriction;

    public Product(String name, double price, int quantity, AgeRestriction ageRestriction) {
        setName(name);
        setPrice(price);
        setQuantity(quantity);
        this.ageRestriction = ageRestriction.getAge();
    }

    private void setName(String name) {
        if (name.isBlank()) {
            throw new RuntimeException("Name can not be empty");
        } else {
            this.name = name;
        }
    }

    private void setPrice(double price) {
        if (price <= 0) {
            throw new RuntimeException("Price can not be less then equal or less then zero");
        } else {
            this.price = price;
        }
    }

    private void setQuantity(int quantity) {
        if (quantity <= 0) {
            throw new RuntimeException("Quantity can not be less then equal or less then zero");
        } else {
            this.quantity = quantity;
        }
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getAgeRestriction() {
        return ageRestriction;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name = " + name +
                ", price= " + price +
                ", quantity= " + quantity +
                ", ageRestriction= " + ageRestriction +
                '}';
    }
}
