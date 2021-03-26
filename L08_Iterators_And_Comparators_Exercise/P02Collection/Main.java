package L08_Iterators_And_Comparators_Exercise.P02Collection;

import javax.naming.OperationNotSupportedException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        String[] strArr = new String[input.length - 1];
        if (input.length - 1 >= 0) System.arraycopy(input, 1, strArr, 0, input.length - 1);

        ListyIterator listyIterator = new ListyIterator(strArr);

        String command = scanner.nextLine();
        while (!command.equals("END")) {
            String[] tokens = command.split("\\s+");
            switch (tokens[0]) {
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
                case "Print":
                    try {
                        listyIterator.print();
                    } catch (OperationNotSupportedException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "PrintAll":
                    listyIterator.printAll();
                    break;

            }
            command = scanner.nextLine();
        }
    }
}
