package L05_Functional_Programming_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P02SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Function<String, Integer> parseMethod = x -> Integer.parseInt(x);

        List<Integer> input = Arrays.stream(scanner.nextLine().split(", "))
                .map(parseMethod)
                .collect(Collectors.toList());

        System.out.printf("Count = %d%n", input.size());
        System.out.printf("Sum = %d", input.stream().mapToInt(x -> x).sum());
    }
}
