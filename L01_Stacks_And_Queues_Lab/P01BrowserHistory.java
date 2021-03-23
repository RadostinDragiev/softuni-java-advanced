package L01_Stacks_And_Queues_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P01BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        ArrayDeque<String> history = new ArrayDeque<>();
        while (!input.equals("Home")) {
            boolean nothingToPrint = true;
            if (input.equals("back")) {
                if (history.size() < 2) {
                    nothingToPrint = false;
                    System.out.println("no previous URLs");
                } else {
                    history.pop();
                }
            } else {
                history.push(input);
            }
            if (nothingToPrint) {
                System.out.println(history.peek());
            }
            input = scanner.nextLine();
        }
    }
}
