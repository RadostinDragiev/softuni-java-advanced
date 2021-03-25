package L05_Functional_Programming_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P03CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Predicate<String> isUpperCase = x -> Character.isUpperCase(x.charAt(0));
        Consumer<String> print = System.out::println;

        List<String> input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(isUpperCase)
                .collect(Collectors.toList());

        System.out.println(input.size());
        input.forEach(print);
    }
}
