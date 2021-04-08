package homework4;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(3);
        list.add(39);
        list.add(38);
        list.add(37);
        list.add(35);
        list.add(1);
        System.out.println("largest " + list.largest());
        System.out.println("smallest " +list.smallest());

        ComparableList<String> comparableList = new ComparableList();
        ComparableList<Integer> integerList = new ComparableList();
        comparableList.add("Lesson");
        integerList.add(4);
        System.out.println(comparableList.toString());
        System.out.println(integerList.toString());

        MyComparableClass<Integer> comparableClass = new MyComparableClass(new Comparable[]{1,2,4,5});
        comparableClass.add(6);
        System.out.println("largest " + comparableClass.largest());
        System.out.println("smallest " + comparableClass.smallest());
    }
}
