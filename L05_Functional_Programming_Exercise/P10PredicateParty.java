package L05_Functional_Programming_Exercise;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P10PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        Map<String, Predicate<String>> predicates = new LinkedHashMap<>();

        String commands = scanner.nextLine();
        while (!commands.equals("Party!")) {
            String predicateName = commands.substring(commands.indexOf(" ") + 1);

            predicates.putIfAbsent(commands, generatePredicate(predicateName));

            commands = scanner.nextLine();
        }


        for (var kvp : predicates.entrySet()) {
            if (kvp.getKey().contains("Remove")) {
                names.removeIf(kvp.getValue());
            } else {
                List<String> collect = names.stream()
                        .filter(kvp.getValue())
                        .collect(Collectors.toList());

                names.addAll(collect);
            }
        }

        if (names.size() == 0) {
            System.out.println("Nobody is going to the party!");
        } else {
            System.out.println(names.stream().sorted(String::compareTo).collect(Collectors.joining(", "))
                    + " are going to the party!");
        }
    }

    private static Predicate<String> generatePredicate(String predicateName) {
        String[] tokens = predicateName.split(" ");

        String type = tokens[0];
        String parameter = tokens[1];

        Predicate<String> predicate = null;

        switch (type) {
            case "StartsWith":
                predicate = s -> s.startsWith(parameter);
                break;
            case "EndsWith":
                predicate = s -> s.endsWith(parameter);
                break;
            case "Length":
                predicate = s -> s.length() == Integer.parseInt(parameter);
                break;
        }

        return predicate;
    }
}
