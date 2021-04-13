package homework5;

import java.util.*;

public class HashSetExercises {
    public static void main(String[] args) {
        //1
        HashSet<String> stringsSet = new HashSet<>();
        stringsSet.add("red");
        stringsSet.add("green");
        stringsSet.add("black");
        System.out.println(stringsSet);
        //2
        System.out.println("iterate by all elements in a hash set");
        Iterator<String> iterator = stringsSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //3
        System.out.println("HashSet size is " + stringsSet.size());
        //4
        System.out.println("Remove all elements");
        stringsSet.removeAll(stringsSet);
        //5
        System.out.println("Check is empty " + stringsSet.isEmpty());
        //6
        HashSet<String> colorSet = new HashSet<>();
        colorSet.add("red");
        colorSet.add("green");
        colorSet.add("black");
        System.out.println("clone hashSet");
        HashSet<String> newSet = (HashSet<String>) colorSet.clone();
        System.out.println(newSet);
        //7 Convert hashSet to array
        String[] array = new String[colorSet.size()];
        colorSet.toArray(array);
        //8
        Set<String> treeSet = new TreeSet<>(newSet);
        System.out.println("TreeSet " + treeSet);
        //9
        List<String> stringList = new ArrayList<>(newSet);
        System.out.println("TreeSet " + stringList);
        //10
        HashSet<String> stringSet = new HashSet<>();
        stringSet.add("red");
        stringSet.add("green");
        stringSet.add("black");
        for (String value : stringSet) {
            if (colorSet.contains(value)) System.out.println("value present in the colorSet");
        }
        //11
        HashSet<String> thingsSet = new HashSet<>();
        thingsSet.add("apple");
        thingsSet.add("book");
        thingsSet.add("pencil");
        HashSet<String> thingsSet_2 = new HashSet<>();
        thingsSet_2.add("apple");
        thingsSet_2.add("laptop");
        thingsSet_2.add("pencil");
        thingsSet_2.retainAll(thingsSet);
        System.out.println("HashSet content: ");
        System.out.println(thingsSet_2);
        //12
        System.out.println("remove all elements");
        thingsSet.clone();
    }
}
