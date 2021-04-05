package homework3.task2;

import homework3.task2.exceptions.AgeException;
import homework3.task2.exceptions.BalanceException;
import homework3.task2.exceptions.ProductException;
import homework3.task2.products.AgeRestriction;
import homework3.task2.products.FoodProduct;
import homework3.task2.products.Product;

import java.time.LocalDate;

public class PurchaseManager {
    public static <T extends Product> void processPurchase(Customer customer, T product) throws AgeException, BalanceException, ProductException {
        checkProductExpirationDateAndQuantity(product);
        if (product.getAgeRestriction() == AgeRestriction.Teenager.getAge() && customer.getAge() < AgeRestriction.Teenager.getAge()) {
            throw new AgeException("You are too young to buy this product");
        } else if (product.getAgeRestriction() == AgeRestriction.Adult.getAge() && customer.getAge() < AgeRestriction.Adult.getAge()) {
            throw new AgeException("You are too young to buy this product");
        } else {
            checkBalanceEnoughForPurchase(product, customer);
            System.out.println("Customer balance after purchase is " + customer.getBalance());
        }
    }

    private static void checkBalanceEnoughForPurchase(Product product, Customer customer) throws RuntimeException {
        if (product.getPrice() > customer.getBalance()) {
            throw new BalanceException("Buyer doesn't have enough money");
        } else {
            var balance = customer.getBalance() - product.getPrice();
            customer.setBalance(balance);
        }
    }


    public static void checkProductExpirationDateAndQuantity(Product product) throws RuntimeException {
        if (product.getQuantity() == 0) {
            throw new ProductException("Product is out of stock");
        } else if (((FoodProduct) product).getExpirationDate().toEpochDay() - LocalDate.now().toEpochDay() <= 0) {
            throw new ProductException("Product is expired");
        }
    }
}

