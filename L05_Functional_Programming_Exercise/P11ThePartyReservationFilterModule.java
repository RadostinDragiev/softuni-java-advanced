package L05_Functional_Programming_Exercise;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P11ThePartyReservationFilterModule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        Map<String, Predicate<String>> predicates = new LinkedHashMap<>();

        String commands = scanner.nextLine();
        while (!commands.equals("Print")) {
            String predicateName = commands.substring(commands.indexOf(";") + 1);

            if (commands.contains("Add")) {
                predicates.putIfAbsent(predicateName, generatePredicate(predicateName));
            } else {
                predicates.remove(predicateName);
            }

            commands = scanner.nextLine();
        }


        Consumer<String> printer = s -> {
            boolean isValid = true;
            for (var str : predicates.entrySet()) {
                if (str.getValue().test(s)) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                System.out.printf("%s ", s);
            }

        };

        names.forEach(printer);
    }

    private static Predicate<String> generatePredicate(String predicateName) {
        String[] tokens = predicateName.split(";");

        String type = tokens[0];
        String parameter = tokens[1];

        Predicate<String> predicate = null;

        switch (type) {
            case "Starts with":
                predicate = s -> s.startsWith(parameter);
                break;
            case "Ends with":
                predicate = s -> s.endsWith(parameter);
                break;
            case "Contains":
                predicate = s -> s.contains(parameter);
                break;
            case "Length":
                predicate = s -> s.length() == Integer.parseInt(parameter);
                break;
        }

        return predicate;
    }
}
