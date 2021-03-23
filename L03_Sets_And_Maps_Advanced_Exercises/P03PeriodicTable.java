package L03_Sets_And_Maps_Advanced_Exercises;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P03PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        Set<String> elements = new TreeSet<>();
        for (int i = 0; i < num; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            for (int j = 0; j < tokens.length; j++) {
                elements.add(tokens[j]);
            }
        }

        elements.forEach(x -> System.out.print(x + " "));
    }
}
