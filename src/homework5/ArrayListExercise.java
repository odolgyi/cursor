package homework5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise {
    public static void main(String[] args) {
        //1
        ArrayList<String> colorList = new ArrayList();
        colorList.add("yellow");
        colorList.add("green");
        colorList.add("white");
        colorList.add("white");
        colorList.add("black");
        //2
        System.out.println(colorList);
        for (String element : colorList) {
            System.out.printf(element + "; ");
        }
        //3
        colorList.add(0, "red");
        System.out.println("get element by index " + colorList.get(0));
        //4
        System.out.println(colorList.get(colorList.size() - 1));
        //5
        colorList.set(3, "orange");
        System.out.println("set new element " + colorList.get(3));
        //6
        colorList.remove(3);
        System.out.println("Element with index 3 was removed");
        //7
        if (colorList.contains("red")) {
            System.out.println("found the element - red");
        } else {
            System.out.println("Element not found");
        }
        //8
        System.out.println("sort list");
        Collections.sort(colorList);
        //9
        List<String> newList = new ArrayList<>();
        newList.add("1");
        newList.add("2");
        newList.add("3");
        newList.add("4");
        newList.add("45");
        newList.add("456");
        Collections.copy(newList, colorList);
        System.out.println("cope elements from list " + newList);
        //10
        Collections.shuffle(colorList);
        System.out.println("shuffle elements " + newList);
        //11
        Collections.reverse(colorList);
        System.out.println("reverse order " + newList);
        //12
        List<String> sublist = colorList.subList(0, 3);
        System.out.println("sublist of colorList " + sublist);
        //13
        System.out.println("List contains elements from another list");
        for (String element : newList) {
            if (colorList.contains(element)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        //14
        System.out.println("swap elements in the list ");
        Collections.swap(newList, 0, newList.size() - 1);
        System.out.println(newList);
        //15
        ArrayList<String> animalsList = new ArrayList<>();
        animalsList.add("cat");
        animalsList.add("dog");
        animalsList.add("elephant");
        animalsList.addAll(colorList);
        System.out.println("Add join 2 arrayList " + animalsList);
        //16
        System.out.println("Clone arrayList");
        ArrayList<String> someList = (ArrayList<String>) colorList.clone();
        //17
        System.out.println("remove all elements");
        someList.remove(someList);
        //18
        System.out.println("Check list is empty" + someList.isEmpty());
        //19
        ArrayList<Integer> numbersList = new ArrayList<>(9);
        numbersList.add(4);
        numbersList.add(48);
        numbersList.add(46);
        numbersList.add(45);
        numbersList.add(48);
        numbersList.trimToSize();
        System.out.println("trim array to size");
        //20
        System.out.println("increase size of an array list");
        numbersList.ensureCapacity(12);
        numbersList.add(11);
        //21
        numbersList.set(5, 500);
        System.out.println(numbersList);
        //22
        System.out.println("Print elements by index");
        for (Integer integer : numbersList) {
            System.out.println(integer);
        }
    }
}
