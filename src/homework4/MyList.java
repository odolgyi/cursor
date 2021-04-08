package homework4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyList<T extends Number> {
    private final List<T> list;

    public MyList() {
        list = new ArrayList<>();
    }

    public void add(T element) {
        list.add(element);
    }

    public T largest() {
        list.sort(Collections.reverseOrder());
        return list.stream().findFirst().orElseThrow(() -> new RuntimeException("List is empty"));
    }

    public T smallest() {
        return list.stream().sorted().findFirst().orElseThrow(() -> new RuntimeException("List is empty"));
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + list + '}';
    }
}
