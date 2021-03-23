package L01_Stacks_And_Queues_Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P01ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        ArrayDeque<String> reversed = new ArrayDeque<>();

        for (String s : input) {
            reversed.push(s);
        }

        reversed.forEach(x -> System.out.printf("%s ", x));
    }
}
