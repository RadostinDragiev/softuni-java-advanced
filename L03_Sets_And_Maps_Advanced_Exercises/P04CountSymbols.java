package L03_Sets_And_Maps_Advanced_Exercises;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P04CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<Character, Integer> database = new TreeMap<>();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (database.containsKey(currentChar)) {
                database.put(currentChar, database.get(currentChar) + 1);
            } else {
                database.put(currentChar, 1);
            }
        }

        database.entrySet().stream().forEach(x -> System.out.printf("%c: %d time/s%n", x.getKey(), x.getValue()));
    }
}
