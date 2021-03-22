import java.util.Arrays;
import java.util.Collections;

public class Test1 {
    public static void main(String[] args) {
        sortArrayByDesc();
        sumArrayOfPositiveNumber();
        average();
        removeDuplicatedNumber();
    }

    public static void sortArrayByDesc() {
        Integer[] list = new Integer[]{2, 3, 1, 7, 11};
        Arrays.sort(list, Collections.reverseOrder());
        System.out.println("Sorted array by desc:");
        for (Integer integer : list) {
            System.out.print(integer + "; ");
        }
    }

    public static void sumArrayOfPositiveNumber() {
        int sumArrayOfPositiveNumber = 0;
        int[] list = new int[]{2, -3, 1, -7, 11};
        for (int number : list) {
            if (number > 0) {
                sumArrayOfPositiveNumber += number;
            }
        }
        System.out.println("\n" + "array sum of positive number");
        System.out.println(sumArrayOfPositiveNumber);
    }

    public static void average() {
        double sum = 0;
        double[] list = new double[]{4, 7, 2, 2, 5};
        for (double number : list) {
            sum += number;
        }
        double averageValue = sum / list.length;
        System.out.println("average sum");
        System.out.println(averageValue);
    }


    public static void removeDuplicatedNumber() {
        int[] list = new int[]{3, 2, 3, 1, 4, 2, 8, 3};
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j]) {
                    list[j] = 0;
                }
            }
        }
        System.out.println("array without duplicates");
        for (int number : list) {
            System.out.print(number + "; ");
        }
    }
}