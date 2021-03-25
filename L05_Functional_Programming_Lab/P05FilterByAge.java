package L05_Functional_Programming_Lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class P05FilterByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleCount = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> nameAgePairs = new LinkedHashMap<>();

        for (int i = 0; i < peopleCount; i++) {
            String[] input = scanner.nextLine().split(", ");

            nameAgePairs.put(input[0], Integer.parseInt(input[1]));
        }

        String condition = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();

        Predicate<Integer> filter = getPredicate(condition, age);
        Consumer<Map.Entry<String, Integer>> printer = getPrinter(format);

        nameAgePairs.entrySet()
                .stream()
                .filter(e -> filter.test(e.getValue()))
                .forEach(e -> printer.accept(e));
    }

    private static Consumer<Map.Entry<String, Integer>> getPrinter(String format) {
        Consumer<Map.Entry<String, Integer>> printer;

        if (format.equals("name")) {
            printer = e -> System.out.println(e.getKey());
        } else if (format.equals("age")) {
            printer = e -> System.out.println(e.getValue());
        } else {
            printer = e -> System.out.printf("%s - %s%n", e.getKey(), e.getValue());
        }

        return printer;
    }

    private static Predicate<Integer> getPredicate(String condition, int age) {
        Predicate<Integer> result;

        if (condition.equals("younger")) {
            result = n -> n <= age;
        } else {
            result = n -> n >= age;
        }
        return result;
    }
}
