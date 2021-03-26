package L07_Generics_Exercise.P06GenericCountMethodDouble;

public class Box<T extends Comparable> {
    private T element;

    public Box(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    @Override
    public String toString() {
        return this.element.getClass().getName() + ": " + this.element;
    }
}