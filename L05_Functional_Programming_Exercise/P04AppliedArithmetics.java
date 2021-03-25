package L05_Functional_Programming_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class P04AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Consumer<List<Integer>> print = x -> {
            x.forEach(e -> System.out.printf("%d ", e));
            System.out.println();
        };

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            if (command.equals("print")) {
                print.accept(input);
            } else {
                mathOperation(command, input);
            }

            command = scanner.nextLine();
        }
    }

    private static List<Integer> mathOperation(String command, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            switch (command) {
                case "add":
                    list.set(i, list.get(i) + 1);
                    break;
                case "multiply":
                    list.set(i, list.get(i) * 2);
                    break;
                case "subtract":
                    list.set(i, list.get(i) - 1);
                    break;
            }
        }
        return list;
    }
}
