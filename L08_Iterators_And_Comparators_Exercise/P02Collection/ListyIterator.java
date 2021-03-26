package L08_Iterators_And_Comparators_Exercise.P02Collection;

import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListyIterator implements Iterable {
    private List<String> items;
    private int internalIndex = 0;

    public ListyIterator(String... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
    }


    public boolean move() {
        if (this.internalIndex > this.items.size()) {
            return false;
        } else {
            this.internalIndex++;
            return true;
        }
    }

    public boolean hasNext() {
        return this.internalIndex + 1 < this.items.size();
    }

    public void print() throws OperationNotSupportedException {
        if (this.items.size() == 0) {
            throw  new OperationNotSupportedException("Invalid Operation!");
        } else {
            System.out.println(this.items.get(internalIndex));
        }
    }

    public void printAll() {
        for (String item : items) {
            System.out.print(String.format("%s ", item));
        }
            System.out.println();
    }

    @Override
    public Iterator iterator() {
        return this.items.iterator();
    }
}
