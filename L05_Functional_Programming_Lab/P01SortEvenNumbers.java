package L05_Functional_Programming_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> evenNumbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        printResult(evenNumbers);

        List<Integer> sortedNumbers = evenNumbers.stream().sorted().collect(Collectors.toList());
        printResult(sortedNumbers);
    }

    private static void printResult(List<Integer> evenNumbers) {
        List<String> result = evenNumbers
                .stream()
                .map(Object::toString)
                .collect(Collectors.toList());

        System.out.printf("%s%n", String.join(", ", result));
    }
}
