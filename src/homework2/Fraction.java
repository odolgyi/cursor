package homework2;

import java.util.Objects;

public class Fraction {
    private long numerator;
    private short denominator;

    public Fraction(long numerator, short denominator) {
        if (denominator == 0) {
            throw new RuntimeException("Denominator can't be null");
        } else {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }

    public Fraction add(Fraction fractions) {
        long resNumerator = numerator * fractions.denominator + fractions.numerator * denominator;
        short resDenominator = (short) (denominator * fractions.denominator);
        return new Fraction(resNumerator, resDenominator);
    }

    public Fraction subtraction(Fraction fractions) {
        long resNumerator = numerator * fractions.denominator - fractions.numerator * denominator;
        short resDenominator = (short) (denominator * fractions.denominator);
        return new Fraction(resNumerator, resDenominator);
    }

    public Fraction multiply(Fraction fractions) {
        long resNumerator = numerator * fractions.numerator;
        short resDenominator = (short) (denominator * fractions.denominator);
        return new Fraction(resNumerator, resDenominator);
    }

    public Fraction division(Fraction fractions) {
        long resNumerator = numerator * fractions.denominator;
        short resDenominator = (short) (denominator * fractions.numerator);
        return new Fraction(resNumerator, resDenominator);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return (double) numerator / denominator == (double) fraction.numerator / fraction.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
