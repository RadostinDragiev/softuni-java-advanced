package L05_Functional_Programming_Lab;

import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class P06FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int lowerBound = Integer.parseInt(input[0]);
        int upperBound = Integer.parseInt(input[1]);

        String evenOrOdd = scanner.nextLine();

        IntPredicate condition;
        if (evenOrOdd.equals("even")) {
            condition = n -> n % 2 == 0;
        } else {
            condition = n -> n % 2 != 0;
        }

        IntStream.range(lowerBound, upperBound + 1)
                .filter(condition)
                .forEach(x -> System.out.printf("%d ", x));
    }
}
