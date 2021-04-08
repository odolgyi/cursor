package homework4;

import java.util.Arrays;
import java.util.Collections;

public class MyComparableClass<T extends Comparable> {
    private T[] array;
    public MyComparableClass(T[] array) {
        this.array = array;
    }

    public void add(T element){
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length -1] = element;
    }

    public T largest() {
        return Arrays.stream(array).min(Collections.reverseOrder()).stream().findFirst()
                .orElseThrow(() -> new RuntimeException("List is empty"));
    }

    public T smallest() {
        return  Arrays.stream(array).max(Collections.reverseOrder()).stream().findFirst()
                .orElseThrow(() -> new RuntimeException("List is empty"));
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + Arrays.toString(array);
    }
}
