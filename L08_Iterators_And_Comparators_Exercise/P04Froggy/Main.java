package L08_Iterators_And_Comparators_Exercise.P04Froggy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Lake lake = new Lake(
                Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray()
        );

        StringBuilder stringBuilder = new StringBuilder();

        for (Integer integer : lake) {
            stringBuilder.append(integer).append(", ");
        }

        String result = stringBuilder.toString();

        System.out.println(result.substring(0, result.lastIndexOf(",")));
    }
}
