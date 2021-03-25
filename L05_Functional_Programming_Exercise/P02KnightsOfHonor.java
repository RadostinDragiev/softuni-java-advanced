package L05_Functional_Programming_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class P02KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.asList(scanner.nextLine().split("\\s+"));

        Consumer<String> print = x -> System.out.printf("Sir %s%n", x);
        input.forEach(print);
    }
}
