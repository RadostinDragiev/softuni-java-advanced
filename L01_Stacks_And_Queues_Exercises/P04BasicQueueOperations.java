package L01_Stacks_And_Queues_Exercises;

import java.util.*;

public class P04BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] commands = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        addElementsToQueue(queue, commands[0], numbers);
        deleteElementsFromQueue(queue, commands[1]);

        if (queue.contains(commands[2])) {
            System.out.println("true");
        } else {
            int minElement = findMinElement(queue);
            System.out.println(minElement);
        }
    }

    private static int findMinElement(ArrayDeque<Integer> queue) {
        List<Integer> numbers = new ArrayList<>(queue);

        int minElement = Integer.MAX_VALUE;
        if (numbers.isEmpty()) {
            return 0;
        }
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < minElement) {
                minElement = numbers.get(i);
            }
        }

        return minElement;
    }

    private static void deleteElementsFromQueue(ArrayDeque<Integer> queue, int command) {
        for (int i = 0; i < command; i++) {
            queue.poll();
        }
    }

    private static void addElementsToQueue(ArrayDeque<Integer> queue, int command, int[] numbers) {
        for (int i = 0; i < command; i++) {
            queue.offer(numbers[i]);
        }
    }
}
