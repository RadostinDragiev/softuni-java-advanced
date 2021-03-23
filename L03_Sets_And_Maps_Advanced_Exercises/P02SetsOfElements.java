package L03_Sets_And_Maps_Advanced_Exercises;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P02SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] sizes = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Set<String> firstSet = readSet(scanner, sizes[0]);
        Set<String> secondSet = readSet(scanner, sizes[1]);

        if (firstSet.size() > secondSet.size()) {
            secondSet.forEach(x -> {
                if (firstSet.contains(x)) {
                    System.out.print(x + " ");
                }
            });
        } else {
            firstSet.forEach(x -> {
                if (secondSet.contains(x)) {
                    System.out.print(x);
                }
            });
        }
    }

    private static Set<String> readSet(Scanner scanner, int size) {
        Set<String> input = new LinkedHashSet<>();
        for (int i = 0; i < size; i++) {
            input.add(scanner.nextLine());
        }

        return input;
    }
}
