package L05_Functional_Programming_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P03CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println(getMin(input));
    }

    private static int getMin(int[] input) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < input.length; i++) {
            if (input[i] < min) {
                min = input[i];
            }
        }
        return min;
    }
}
