package util;

import java.util.Comparator;
import java.util.List;

public class ListComparator <T extends Comparable<T>> implements Comparator<List<T>> {

    @Override
    public int compare(List<T> o1, List<T> o2) {
        if(o1.size() != o2.size()){
            return Integer.compare(o1.size(), o2.size());
        }

        for (int i = 0; i < o1.size(); i++) {
            int c = o1.get(i).compareTo(o2.get(i));
            if (c != 0) {
                return c;
            }
        }
        return 0;
    }
}
