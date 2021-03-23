package L03_Sets_And_Maps_Advanced_Lab;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> numbers = new LinkedHashMap<>();
        for (int i = 0; i < input.length; i++) {
            if (!numbers.containsKey(input[i])) {
                numbers.put(input[i], 1);
            } else {
                numbers.put(input[i], numbers.get(input[i]) + 1);
            }
        }

        numbers.forEach((key, value) -> System.out.printf("%.1f -> %d%n", key, value));
    }
}
