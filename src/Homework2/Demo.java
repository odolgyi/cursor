package Homework2;

import Homework2.Money.Money;
import Homework2.car.Car;

public class Demo {
    public static void main(String[] args) {
        //Exercise 1
        Circle circle1 = new Circle(4);
        System.out.println("Circle with radius " + circle1.getRadius() + " has square = " + circle1.getSquare());

        //Exercise 2
        Factory TORCHEN = new Factory();
        Factory ROSHEN = new Factory();
        Factory KORONA = new Factory();
        var getNumberOfExamples = Factory.getNumberOfExamples();
        System.out.println("number of created  instance of class= " + Factory.class + " is " + getNumberOfExamples);

        //Exercise 3
        Car porshe = new Car();
        porshe.startEngine();
        porshe.increaseSpeed(10);
        porshe.increaseSpeed(20);
        porshe.increaseSpeed(30);
        porshe.cruiseControl(true);
        porshe.cruiseControl(false);
        porshe.decreaseSpeed(20);
        porshe.decreaseSpeed(20);
        porshe.stopEngine();

        //Exercise 4
        Fraction fraction1 = new Fraction(2, (short) 8);
        Fraction fraction2 = new Fraction(1, (short) 2);
        System.out.println("//Exercise 4");
        System.out.println(fraction1.toString() + " + " + fraction2.toString() + " = " + fraction1.add(fraction2));
        System.out.println(fraction1.toString() + " - " + fraction2.toString() + " = " + fraction1.subtraction(fraction2));
        System.out.println(fraction1.toString() + " * " + fraction2.toString() + " = " + fraction1.multiply(fraction2));
        System.out.println(fraction1.toString() + " / " + fraction2.toString() + " = " + fraction1.division(fraction2));
        System.out.println(fraction1.toString() + " is equal to " + fraction2.toString() + " = " + fraction1.isEqual(fraction2));

        //Exercise 5
        Money yourMoney = new Money(1, (byte) 90);
        yourMoney.sum(1, (byte) 92);
        System.out.println("//Exercise 5");
        System.out.println(yourMoney.toString() + " is sum =" + new Money(1, (byte) 90).toString() + " +" + new Money(1, (byte) 92).toString());
        yourMoney.subtraction(2, (byte) 82);
        System.out.println(yourMoney.toString() + " is minus =" + new Money(3, (byte) 82).toString() + " -" + new Money(2, (byte) 82).toString());
        var result = yourMoney.div(new Money(2, (byte) 0));
        System.out.println(yourMoney.toString() + " divide on " + new Money(2, (byte) 0).toString() + " = " + result.toString());

        var multiply = yourMoney.multiplyMoney(new Money(2, (byte) 0));
        System.out.println(yourMoney.toString() + " multiply on " + new Money(2, (byte) 0).toString() + " =" + multiply);

        var twoHryvnia = new Money(2, (byte) 0);
        System.out.println(yourMoney.toString() + " is not equal to " + twoHryvnia.toString() + " = " + yourMoney.isEqual(twoHryvnia));

        var oneHryvnia = new Money(1, (byte) 0);
        System.out.println(yourMoney.toString() + " is equal to " + oneHryvnia.toString() + " = " + yourMoney.isEqual(oneHryvnia));

    }
}
