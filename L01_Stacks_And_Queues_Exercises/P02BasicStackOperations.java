package L01_Stacks_And_Queues_Exercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class P02BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        pushElements(stack, input, numbers[0]);
        popElements(stack, numbers[1]);


        if (stack.contains(numbers[2])) {
            System.out.println("true");
        } else if (stack.isEmpty()) {
            System.out.println(0);
        } else {
            int minNumber = findSmallestNumber(stack);
            System.out.println(minNumber);
        }
    }

    private static int findSmallestNumber(ArrayDeque<Integer> stack) {
        int[] presentNumbers = new int[stack.size()];
        for (int i = 0; i < presentNumbers.length; i++) {
            presentNumbers[i] = stack.pop();
        }

        int minNumber = Integer.MAX_VALUE;
        for (int i = 0; i < presentNumbers.length; i++) {
            if (presentNumbers[i] < minNumber) {
                minNumber = presentNumbers[i];
            }
        }

        return minNumber;
    }

    private static void popElements(ArrayDeque<Integer> stack, int number) {
        for (int i = 0; i < number; i++) {
            stack.pop();
        }
    }

    private static void pushElements(ArrayDeque<Integer> stack, int[] input, int number) {
        for (int i = 0; i < number; i++) {
            stack.push(input[i]);
        }
    }
}
