package L07_Generics_Lab.P04ListUtilities;

import java.util.List;

public class ListUtils {
    public static <T extends Comparable<T>> T getMax(List<T> items) {
        if (items.size() == 0) {
            throw new IllegalArgumentException();
        }

        T currentMax = items.get(0);

        for (int i = 0; i < items.size(); i++) {
            T current = items.get(i);

            if (currentMax.compareTo(current) < 0 ) {
                currentMax = current;
            }
        }

        return currentMax;
    }

    public static <T extends Comparable<T>> T getMin(List<T> items) {
        if (items.size() == 0) {
            throw new IllegalArgumentException();
        }

        T currentMax = items.get(0);

        for (int i = 0; i < items.size(); i++) {
            T current = items.get(i);

            if (currentMax.compareTo(current) > 0 ) {
                currentMax = current;
            }
        }

        return currentMax;
    }
}
