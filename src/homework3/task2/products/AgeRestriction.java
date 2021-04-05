package homework3.task2.products;

public enum AgeRestriction {
    None(0), Teenager(17), Adult(21);

    private int age;

    AgeRestriction(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
