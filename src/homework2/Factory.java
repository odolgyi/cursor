package homework2;

public class Factory {
    private int year;
    private int price;
    private int employee;
    private static int numberOfExamples = 0;

    public Factory() {
        numberOfExamples++;
    }

    public static int getNumberOfExamples() {
        return numberOfExamples;
    }
}
