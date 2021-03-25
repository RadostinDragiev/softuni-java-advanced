package L05_Functional_Programming_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P07FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Function<List<Integer>, Integer> findElement = list -> {
          List<Integer> integers = new ArrayList<>(list);

          return integers.lastIndexOf(integers.stream().min(Integer::compareTo).orElse(-1));
        };

        System.out.println(findElement.apply(input));
    }
}
