package L05_Functional_Programming_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P08CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .sorted((f, s) -> {
                    int result = 0;
                    if (f % 2 == 0 && s % 2 != 0) {
                        result = -1;
                    } else if (f % 2 != 0 && s % 2 == 0) {
                        result = 1;
                    } else {
                        result = f - s;

                    }

                    return result;
                })
                .forEach(x -> System.out.printf("%d ", x));
    }
}
