package L01_Stacks_And_Queues_Exercises;

import java.util.*;

public class P03MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOFCommands = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < numberOFCommands; i++) {
            int[] commands = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

            if (commands[0] == 1) {
                stack.push(commands[1]);
            } else if (commands[0] == 2) {
                stack.pop();
            } else if (commands[0] == 3) {
                int maxElement = findMaxElement(stack);
                System.out.println(maxElement);
            }
        }
    }

    private static int findMaxElement(ArrayDeque<Integer> stack) {
        List<Integer> numbers = new ArrayList<>(stack);

        int maxNumber = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > maxNumber) {
                maxNumber = numbers.get(i);
            }
        }
        return maxNumber;
    }
}
