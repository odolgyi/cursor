package homework5;


import java.util.*;

public class LinkedListExercises {
    public static void main(String[] args) {
        //1
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("book");
        linkedList.add("pencil");
        linkedList.add("pen");
        linkedList.add("cup");
        System.out.println("add element " + linkedList);
        //2 iterate elements in a linked list
        for (String element : linkedList) {
            System.out.println("iterate elements in a linked list" + element);
        }
        //3 iterate from specified position
        Iterator<String> iterator = linkedList.listIterator(2);
        while (iterator.hasNext()) {
            System.out.println("iterate from specified position " + iterator.next());
        }
        //4 iterate in reverse order
        Iterator<String> descendingIterator = linkedList.descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.println(" iterate in reverse order " + descendingIterator.next());
        }

        //5 add element in specified position
        linkedList.add(1, "Plane");

        //6
        System.out.println("Add element at the first and last position");
        linkedList.addFirst("bicycle");
        linkedList.addLast("car");
        //7
        System.out.println("Insert element at the front of a linked list");
        linkedList.offerFirst("Apple");
        System.out.println(linkedList);
        //8
        System.out.println("Insert element at the end of a linked list");
        linkedList.offerLast("Cherry");
        System.out.println(linkedList);
        //9
        System.out.println("Insert element at the specific place");
        linkedList.add(1, "Laptop");
        System.out.println(linkedList);
        //10
        System.out.println("Get first and last element");
        linkedList.getFirst();
        linkedList.getLast();
        //11
        for (int index = 0; index < linkedList.size(); index++) {
            System.out.println("Element at index" + index + " : " + linkedList.get(index));
        }
        //12
        System.out.println("remove element at the specific place");
        linkedList.remove(1);
        System.out.println(linkedList);
        //13
        System.out.println("Remove last and first element");
        linkedList.removeFirst();
        linkedList.removeLast();
        //14
        System.out.println("Remove all elements");
        linkedList.clear();
        //15
        System.out.println("Swap two elements");
        LinkedList<String> linked = new LinkedList<>();
        linked.add("book");
        linked.add("pencil");
        linked.add("pen");
        linked.add("cup");
        Collections.swap(linked, 0, 1);
        //16
        Collections.shuffle(linked);
        //17
        System.out.println("Join two linked list");
        LinkedList<String> carList = new LinkedList<>();
        linked.add("reno");
        linked.add("audi");
        LinkedList<String> allValues = new LinkedList<>();
        allValues.addAll(carList);
        allValues.addAll(linked);
        System.out.println(allValues);
        //18
        LinkedList<String> joinList = (LinkedList<String>) allValues.clone();
        System.out.println("New clone list" + joinList);
        //19
        System.out.println("return and remove element: " + joinList.pop());
        System.out.println(joinList);

        //20
        System.out.println("return first element: " + joinList.peekFirst());
        //21
        System.out.println("return first element: " + joinList.peekLast());
        //22
        if (joinList.contains("pencil")) {
            System.out.println("pencil is present in the linked list");
        }
        //23
        System.out.println("convert LinkedList to the ArrayList");
        List<String> arrayList = new ArrayList<>(joinList);
        //24
        LinkedList<String> linked_1 = new LinkedList<>();
        linked_1.add("book");
        linked_1.add("pencil");
        linked_1.add("pen");
        LinkedList<String> linked_2 = new LinkedList<>();
        linked_2.add("book");
        linked_2.add("pencil");
        linked_2.add("pen");
        for (String value: linked_1) {
            System.out.println("Compare value from lists:");
            if (linked_2.contains(value)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        //25
        System.out.println(linked_1);
        System.out.println("check if list is empty: " + linked_1.isEmpty());
        //26
        System.out.println("replace an element in list");
        linked_2.set(0, "Something");
        System.out.println(linked_2);
    }
}
