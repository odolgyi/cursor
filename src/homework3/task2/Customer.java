package homework3.task2;

public class Customer {
    private String name;
    private int age;
    public double balance;

    public Customer(String name, int age, double balance) {
        setName(name);
        setAge(age);
        this.balance = balance;
    }

    private void setName(String name) {
        if (name.isBlank()) {
            throw new RuntimeException("Name can not be empty");
        } else {
            this.name = name;
        }
    }

    private void setAge(int age) {
        if (age <= 0) {
            throw new RuntimeException("Age can not be less then equal or less then zero");
        } else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
