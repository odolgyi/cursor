package homework7.entry;

import homework7.Country;
import homework7.Gender;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private Gender gender;
    private Country country;

    public Person(String name, int age, Gender gender, Country country) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public Country getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Person{ name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", country=" + country +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name) && gender == person.gender && country == person.country;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender, country);
    }
}
