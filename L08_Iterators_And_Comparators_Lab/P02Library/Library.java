package L08_Iterators_And_Comparators_Lab.P02Library;

import java.util.Iterator;

public class Library<T> implements Iterable<T> {
    private T[] books;

    public Library(T... books) {
        this.books = books;
    }

    @Override
    public Iterator<T> iterator() {
        return new LibraryIterator();
    }

    private class LibraryIterator implements Iterator<T>{
        private int currentIndex;

        public LibraryIterator() {
            this.currentIndex = 0;
        }

        @Override
        public boolean hasNext() {
            return this.currentIndex < books.length;
        }

        @Override
        public T next() {
            return books[this.currentIndex++];
        }
    }
}
