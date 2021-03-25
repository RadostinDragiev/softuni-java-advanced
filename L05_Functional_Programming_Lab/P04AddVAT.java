package L05_Functional_Programming_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> input = Arrays.stream(scanner.nextLine().split(", "))
                .map(Double::parseDouble)
                .map(x -> x * 1.2)
                .collect(Collectors.toList());

        System.out.println("Prices with VAT:");
        input.forEach(x -> System.out.printf("%.2f%n", x));
    }
}
