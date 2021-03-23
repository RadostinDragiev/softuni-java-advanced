package L01_Stacks_And_Queues_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P08BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        ArrayDeque<String> history = new ArrayDeque<>();
        ArrayDeque<String> forwardhistory = new ArrayDeque<>();
        while (!input.equals("Home")) {
            boolean nothingToPrint = true;
            if (input.equals("back")) {
                if (history.size() < 2) {
                    nothingToPrint = false;
                    System.out.println("no previous URLs");
                } else {
                    String removed = history.pop();
                    forwardhistory.push(removed);
                }
            } else if (input.equals("forward")) {
                nothingToPrint = false;
                if (forwardhistory.isEmpty()) {
                    System.out.println("no next URLs");
                } else {
                    String forward = forwardhistory.pop();
                    history.push(forward);
                    System.out.println(forward);
                }
            } else {
                history.push(input);
                forwardhistory.clear();
            }

            if (nothingToPrint) {
                System.out.println(history.peek());
            }

            input = scanner.nextLine();
        }
    }
}
