package L01_Stacks_And_Queues_Lab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class P06HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue, input);

        while (queue.size() > 1) {
            for (int i = 1; i < n; i++) {
                String removed = queue.remove();
                queue.offer(removed);
            }

            String name = queue.remove();
            System.out.printf("Removed %s%n", name);
        }

        String name = queue.peek();
        System.out.printf("Last is %s%n", name);
    }
}
