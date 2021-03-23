package L01_Stacks_And_Queues_Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P06BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("");

        ArrayDeque<String> queue = new ArrayDeque<>();
        for (int i = 0; i < input.length / 2; i++) {
            queue.offer(input[i]);
        }

        boolean areTheyEqual = false;
        for (int i =  input.length - 1; i >= input.length / 2; i--) {
            if (queue.isEmpty()) {
                break;
            }
            String firstInQueue = queue.poll();
            String firstInArr = input[i];

            switch (firstInArr) {
                case ")":
                    if (firstInQueue.equals("(")) {
                        areTheyEqual = true;
                    } else {areTheyEqual = false;}
                    break;
                case "]":
                    if (firstInQueue.equals("[")) {
                        areTheyEqual = true;
                    } else {areTheyEqual = false;}
                    break;
                case "}":
                    if (firstInQueue.equals("{")) {
                        areTheyEqual = true;
                    } else {areTheyEqual = false;}
                    break;
            }

            if (!areTheyEqual) {
                break;
            }
        }

        if (areTheyEqual) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
