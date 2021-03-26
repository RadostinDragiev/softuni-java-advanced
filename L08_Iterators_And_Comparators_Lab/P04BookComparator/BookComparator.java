package L08_Iterators_And_Comparators_Lab.P04BookComparator;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {
    @Override
    public int compare(Book left, Book right) {
        if (left.getTitle().compareTo(right.getTitle()) == 0) {
            return left.getYear().compareTo(right.getYear());
        }
        return left.getTitle().compareTo(right.getTitle());
    }
}
