package L01_Stacks_And_Queues_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P02SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");

        ArrayDeque<Integer> result = new ArrayDeque<>();
        for (int i = 0; i < input.length; i++) {
            if (result.isEmpty()) {
                result.push(Integer.parseInt(input[i]));
                continue;
            }

            int calculation = 0;
            if (input[i].equals("+")) {
                calculation = result.pop() + Integer.parseInt(input[i + 1]);
                result.push(calculation);
            } else if (input[i].equals("-")) {
                calculation = result.pop() - Integer.parseInt(input[i + 1]);
                result.push(calculation);
            }
        }

        System.out.println(result.peek());
    }
}
