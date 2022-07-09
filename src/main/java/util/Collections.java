package util;

import java.util.ArrayList;
import java.util.List;

public class Collections {
    public static <T> List<T> asList(T... items) {
        List<T> list = new ArrayList<T>();
        for (T item : items) {
            list.add(item);
        }

        return list;
    }

    public static <T> ArrayList<T> asArrList(T... items) {
        ArrayList<T> list = new ArrayList<T>();
        for (T item : items) {
            list.add(item);
        }

        return list;
    }
}
