package Homework2.Money;

public class Money {
    private long hryvnia;
    private byte kopeck;

    public Money(long hryvnia, byte kopeck) {
        if (hryvnia > 0) {
            this.hryvnia = hryvnia;
        }
        if (kopeck > 0 && kopeck <= 99) {
            this.kopeck = kopeck;
        }

    }

    public void sum(long hryvnia, byte kopeck) {
        long hryvniaResult = this.hryvnia + hryvnia;
        long kopeckResult = this.kopeck + kopeck;
        if (kopeckResult > 100) {
            hryvniaResult += kopeckResult / 100;
            kopeckResult -= 100;
        }
        this.hryvnia = hryvniaResult;
        this.kopeck = (byte) kopeckResult;
    }

    public void subtraction(long hryvnia, byte kopeck) {
        long hryvniaResult = this.hryvnia - hryvnia;
        long kopeckResult = this.kopeck - kopeck;
        if (kopeckResult < 0) {
            hryvniaResult -= 1;
            kopeckResult += 100;
        }
        this.hryvnia = hryvniaResult;
        this.kopeck = (byte) kopeckResult;
    }

    public Money div(Money money) {
        return this.divDoubleNumbers(moneyToDouble(money));
    }

    public Money multiplyMoney(Money money) {
        return multiplyDoubleNumbers(moneyToDouble(money));
    }

    public boolean isEqual(Money money) {
        return this.hryvnia == money.hryvnia && this.kopeck == money.kopeck;
    }

    private Money multiplyDoubleNumbers(double number) {
        double money = moneyToDouble(this);
        return doubleToMoney(money * number);
    }

    private Money divDoubleNumbers(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Can not divide on negative numbers");
        }
        double money = moneyToDouble(this);
        return doubleToMoney(money / number);
    }

    private Money doubleToMoney(double value) {
        long hryvnias = (long) value;
        byte kopecks = (byte) ((value - hryvnias) * 100);
        return new Money(hryvnias, kopecks);
    }

    private static double moneyToDouble(Money money) {
        return (money.hryvnia * 100 + money.kopeck) / 100d;
    }

    @Override
    public String toString() {
        return hryvnia + "," + kopeck;
    }

}
