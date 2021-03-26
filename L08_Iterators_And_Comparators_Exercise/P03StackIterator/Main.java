package L08_Iterators_And_Comparators_Exercise.P03StackIterator;

import javax.naming.OperationNotSupportedException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        CustomStack customStack = new CustomStack();
        while (!input[0].equals("END")) {
            if (input[0].equals("Push")) {
                StringBuilder format = new StringBuilder();
                for (int i = 1; i < input.length; i++) {
                    format.append(input[i]);
                }

                String[] numbers = format.toString().split(",");

                for (int i = 0; i < numbers.length; i++) {
                    customStack.push(Integer.parseInt(numbers[i]));
                }
            } else {
                try {
                    customStack.pop();
                } catch (OperationNotSupportedException e) {
                    System.out.println(e.getMessage());
                }
            }

            input = scanner.nextLine().split("\\s+");
        }

        for (int i = 0; i < 2; i++) {
            for (int j = customStack.getStack().size() - 1; j >= 0; j--) {
                System.out.println(customStack.getStack().get(j));
            }
        }
    }
}
