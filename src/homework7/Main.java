package homework7;

import homework7.entry.Person;

import java.util.HashSet;
import java.util.List;

import static homework7.Country.ARGENTINA;
import static homework7.Country.AUSTRALIA;
import static homework7.Country.FRANCE;
import static homework7.Country.ISRAEL;
import static homework7.Country.POLAND;
import static homework7.Country.UKRAINE;
import static homework7.Country.USA;
import static homework7.Gender.FEMALE;
import static homework7.Gender.MALE;

public class Main {
    public static void main(String[] args) {
        var personList = List.of(
                new Person("Petro", 25, MALE, UKRAINE),
                new Person("Olena", 19, FEMALE, UKRAINE),
                new Person("Marek", 50, MALE, POLAND),
                new Person("Rasine", 65, FEMALE, POLAND),
                new Person("Cherina", 42, FEMALE, FRANCE),
                new Person("Bridgett", 18, FEMALE, FRANCE),
                new Person("Jaron", 42, MALE, ISRAEL),
                new Person("Namir", 18, MALE, ISRAEL),
                new Person("John", 10, MALE, USA),
                new Person("Jane", 78, FEMALE, USA),
                new Person("Alonzo", 12, MALE, ARGENTINA),
                new Person("Azael", 43, FEMALE, ARGENTINA),
                new Person("Thomas", 12, MALE, AUSTRALIA),
                new Person("Brittney", 43, FEMALE, AUSTRALIA));

        personList.stream().filter(person -> person.getAge() >= 18 && person.getAge() < 60)
                .forEach(System.out::println);
        System.out.println("Set of person");
        personList.stream().filter(person -> person.getAge() >= 18 && person.getAge() < 60)
                .collect(HashSet::new,
                        (hashSet, person) -> hashSet.add(person.getName() + " - " + (person.getGender() == MALE ? "m" : "f")),
                        HashSet::addAll)
                .forEach(System.out::println);
    }
}
