package L01_Stacks_And_Queues_Lab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class P07MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue, input);

        int cycle = 1;
        while (queue.size() > 1) {
            for (int i = 1; i < n; i++) {
                String removed = queue.remove();
                queue.offer(removed);
            }

            String name = queue.peek();
            if (!isPrime(cycle)) {
                System.out.printf("Removed %s%n", name);
                queue.remove();
            } else {
                System.out.printf("Prime %s%n", name);
            }

            cycle++;
        }

        String name = queue.peek();
        System.out.printf("Last is %s%n", name);
    }

    private static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
