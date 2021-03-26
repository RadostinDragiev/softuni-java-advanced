package L07_Generics_Exercise.P07CustomList;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Consumer;

public class SmartList<T extends Object & Comparable> {
    private static final int INITIAL_CAPACITY = 4;
    private T[] data;
    private int size;

    public SmartList() {
        this.data = (T[]) Array.newInstance(Object.class, INITIAL_CAPACITY);
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public void add(T element) {
        if (this.size == this.data.length) {
            resize();
        }
        this.data[this.size++] = element;

    }

    private void resize() {
        T[] tempData = (T[]) Array.newInstance(Object.class, this.data.length * 2);

        for (int i = 0; i < this.data.length; i++) {
            tempData[i] = this.data[i];
        }

        this.data = tempData;
    }

    public T remove(int index) {
        T element = this.data[index];

        for (int i = 0; i < size - 1; i++) {
            this.data[i] = this.data[i + 1];
        }

        this.data[this.size--] = null;

        return element;
    }

    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (this.data[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public void swap(int firstIndex, int secondIndex) {
        T temp = this.data[firstIndex];
        this.data[firstIndex] = this.data[secondIndex];
        this.data[secondIndex] = temp;
    }

    public int countGreaterThan(T element) {
        return (int) Arrays.stream(this.data, 0, this.size)
                .filter(x -> x.compareTo(element) > 0)
                .count();
    }

    public T getMax() {
        return Arrays.stream(this.data, 0, this.size)
                .max(T::compareTo)
                .orElse(null);

    }

    public T getMin() {
        return Arrays.stream(this.data, 0, this.size)
                .min(T::compareTo)
                .orElse(null);
    }

    public void forEach(Consumer<T> consumer) {
        for (int i = 0; i < this.size; i++) {
            consumer.accept(this.data[i]);
        }
    }
}