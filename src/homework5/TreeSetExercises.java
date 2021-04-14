package homework5;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExercises {
    public static void main(String[] args) {
        //1
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("White");
        treeSet.add("Red");
        treeSet.add("Black");
        treeSet.add("Green");
        System.out.println("Tree set:");
        System.out.println(treeSet);
        //2
        Iterator<String> iterator = treeSet.iterator();
        System.out.println("iterate by treeSet");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "; ");
        }
        //3
        TreeSet<String> specifiedSet = new TreeSet<>();
        specifiedSet.addAll(treeSet);
        System.out.println("\n" + "Add all elements from TreeSet to the new TreeSet ");
        System.out.println(specifiedSet);
        //4
        Iterator<String> iteratorReverse = specifiedSet.descendingIterator();
        System.out.println("reverse order view of the elements by treeSet");
        while (iteratorReverse.hasNext()) {
            System.out.print(iteratorReverse.next() + "; ");
        }
        //5
        System.out.println("\n" + "First element " + specifiedSet.first());
        System.out.println("Last element " + specifiedSet.last());
        //6
        TreeSet<String> cloneTreeSet = (TreeSet<String>) specifiedSet.clone();
        System.out.println("Clone tree set");
        System.out.println(cloneTreeSet);
        //7
        System.out.println(cloneTreeSet.size());
        //8
        TreeSet<String> treeSet_1 = new TreeSet<>();
        treeSet_1.add("Audi");
        treeSet_1.add("Reno");
        treeSet_1.add("Man");
        treeSet_1.add("Ford");
        treeSet_1.add("Fiat");
        TreeSet<String> treeSet_2 = new TreeSet<>();
        treeSet_2.add("Audi");
        treeSet_2.add("Reno");
        treeSet_2.add("Man");
        treeSet_2.add("Ford");
        treeSet_2.add("Bugatti");
        for (String element : treeSet_1) {
            if (treeSet_2.contains(element)) {
                System.out.println(element + "is present in two set");
            }
        }
        //9
        TreeSet<Integer> integerTreeSet = new TreeSet<>();
        integerTreeSet.add(1);
        integerTreeSet.add(2);
        integerTreeSet.add(4);
        integerTreeSet.add(6);
        integerTreeSet.add(9);
        integerTreeSet.add(45);
        integerTreeSet.add(910);
        integerTreeSet.add(8877);
        System.out.println("Find numbers less then 7");
        System.out.println(integerTreeSet.headSet(7));
        //10
        System.out.println("Find numbers greater then 8877 or equal");
        System.out.println(integerTreeSet.ceiling(8877));
        System.out.println("Find numbers greater then 800 or equal");
        System.out.println(integerTreeSet.ceiling(800));
        //11
        System.out.println("Find numbers less then 1000 or equal");
        System.out.println(integerTreeSet.floor(1000));
        //12
        System.out.println("Strictly greater than equal 40 and 6");
        System.out.println(integerTreeSet.higher(40));
        System.out.println(integerTreeSet.higher(6));
        //13
        System.out.println("Strictly less than equal 5 and 50");
        System.out.println(integerTreeSet.lower(5));
        System.out.println(integerTreeSet.lower(50));
        //14
        System.out.println("Tree set " + integerTreeSet);
        integerTreeSet.pollFirst();
        System.out.println("Tree set after removing first element " + integerTreeSet);
        //15
        System.out.println("Tree set " + integerTreeSet);
        integerTreeSet.pollLast();
        System.out.println("Tree set after removing  last element " + integerTreeSet);
        //16
        System.out.println("remove element by value");
        integerTreeSet.remove(910);
        System.out.println("Tree set after removing element " + integerTreeSet);
    }
}