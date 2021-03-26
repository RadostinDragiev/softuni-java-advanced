package L07_Generics_Lab.P03GenericScale;

public class Scale <T extends Comparable>{
    private T right;
    private T left;

    public Scale(T right, T left) {
        this.right = right;
        this.left = left;
    }

    public T getHeavier() {
        int compareResult = this.right.compareTo(this.left);

        if (compareResult == 0) {
            return null;
        }

        return compareResult > 0 ? this.right : this.left;
    }
}
