import java.util.Arrays;
import java.util.Collections;

public class Test1 {
    public static void main(String[] args) {
        sortArrayByDesc();
        arraySum();
        averageSum();
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

    public static void arraySum() {
        int sum = 0;
        int[] list = new int[]{2, -3, 1, -7, 11};
        for (Integer integer : list) {
            sum += integer;
        }
        System.out.println("\n" +"array sum");
        System.out.println(sum);
    }

    public static void averageSum() {
        int sum = 0;
        int[] list = new int[]{4, 7, 2, 2, 5};
        for (long number : list) {
            sum += number;
        }
        int averageValue = sum / list.length;
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