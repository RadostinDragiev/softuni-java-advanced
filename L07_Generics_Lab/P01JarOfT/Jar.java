package L07_Generics_Lab.P01JarOfT;

import java.util.ArrayDeque;

public class Jar <T> {
    private ArrayDeque<T> deque;

    public Jar() {
        this.deque = new ArrayDeque<>();
    }

    public void add (T element) {
        this.deque.add(element);
    }

    public T remove() {
        return this.deque.pop();
    }
}