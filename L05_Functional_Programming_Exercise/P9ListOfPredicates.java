package L05_Functional_Programming_Exercise;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P9ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Set<Integer> input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());

        Predicate<Integer> isDivisible = x -> {
            for (Integer integer : input) {
                if (x % integer != 0) {
                    return false;
                }
            }

            return true;
        };

        Consumer<Integer> print = x -> System.out.printf("%d ", x);

        for (int i = 1; i <= n; i++) {
            if (isDivisible.test(i)) {
                print.accept(i);
            }
        }
    }
}
