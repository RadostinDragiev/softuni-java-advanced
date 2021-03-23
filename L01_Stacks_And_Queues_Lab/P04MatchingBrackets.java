package L01_Stacks_And_Queues_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P04MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        String[] input = inputLine.split("");

        ArrayDeque<Integer> brackets = new ArrayDeque<>();
        for (int i = 0; i < input.length; i++) {
            if (input[i].equals("(")) {
                brackets.push(i);
            } else if (input[i].equals(")")) {
                int startIndex = brackets.pop();
                int endIndex = i;
                String result = inputLine.substring(startIndex, endIndex + 1);
                System.out.println(result);
            }
        }
    }
}
