package L01_Stacks_And_Queues_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P05PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        ArrayDeque<String> queue = new ArrayDeque<>();
        while (!input.equals("print")) {
            if (input.equals("cancel")) {
                if (queue.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    String removed = queue.remove();
                    System.out.printf("Canceled %s%n", removed);
                }
            } else {
                queue.offer(input);
            }

            input = scanner.nextLine();
        }

        queue.forEach(System.out::println);
    }
}
