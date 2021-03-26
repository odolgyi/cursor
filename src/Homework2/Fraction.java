package Homework2;

public class Fraction {
    private long numerator;
    private short denominator;

    public Fraction(long numerator, short denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Denominator can't be null");
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

    public boolean isEqual(Fraction fraction) {
        return (double) numerator / denominator == (double) fraction.numerator / fraction.denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
