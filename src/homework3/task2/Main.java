package homework3.task2;

import homework3.task2.interfaces.Expirable;
import homework3.task2.products.*;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        try {
            LocalDate today = LocalDate.now();
            FoodProduct cake = new FoodProduct("Fruit cake", 7.99, 200, AgeRestriction.None, today.plusDays(7));
            Product cigarette = new FoodProduct("Bond", 30.00, 1400, AgeRestriction.Adult, today.plusYears(3));
            Customer adultPerson = new Customer("Nik", 22, 40.00);
            PurchaseManager.processPurchase(adultPerson, cake);
            PurchaseManager.processPurchase(adultPerson, cigarette);

            List<Product> products = List.of(cake, cigarette,
                    new Appliance("Samsung telephone", 20000, 100, AgeRestriction.None),
                    new Computer("Xiaomi TV", 1600, 150, AgeRestriction.None),
                    new Appliance("Xiaomi TV", 1600, 150, AgeRestriction.None),
                    new FoodProduct("Bread", 0.90, 100, AgeRestriction.None, today.plusDays(3)),
                    new FoodProduct("Milk", 4.50, 200, AgeRestriction.None, today.plusDays(5)),
                    new FoodProduct("Cheese", 17.90, 50, AgeRestriction.None, today.plusDays(20)),
                    new FoodProduct("Chocolate", 22.90, 70, AgeRestriction.None, today.plusDays(40)),
                    new Appliance("Washing machine", 1120.90, 2, AgeRestriction.None),
                    new FoodProduct("Wine", 15.00, 10, AgeRestriction.Adult, today.plusYears(30))
            );
            System.out.println("Sort all expiration products");
            List<Product> expirationList = products.stream()
                    .filter(product -> product instanceof Expirable)
                    .collect(Collectors.toList());
            expirationList.forEach(System.out::println);

            System.out.println("Get the soonest expiration product");
            String soonestExpirationProduct = expirationList.stream()
                    .filter(p -> ((Expirable) p).getExpirationDate().isEqual(today) || ((Expirable) p).getExpirationDate().isAfter(today))
                    .sorted(Comparator.comparingLong(p -> ((Expirable) p).getExpirationDate().toEpochDay()))
                    .findFirst().get().getName();
            System.out.println("The soonest expiration product is " + soonestExpirationProduct);

            List<Product> adultProducts = products.stream()
                    .filter(p -> p.getAgeRestriction() >= AgeRestriction.Adult.getAge())
                    .sorted(Comparator.comparing(Product::getPrice).reversed())
                    .collect(Collectors.toList());
            adultProducts.forEach(System.out::println);

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}