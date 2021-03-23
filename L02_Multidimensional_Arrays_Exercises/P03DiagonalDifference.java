package L02_Multidimensional_Arrays_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P03DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dimension = Integer.parseInt(scanner.nextLine());

        int[][] matrix = readMatrix(dimension, scanner);

        int difference = findDifference(matrix);

        System.out.println(difference);
    }

    private static int findDifference(int[][] matrix) {
        int mainDiagonal = calculateMainDiagonal(matrix);
        int secondaryDiagonal = calculateSecondaryDiagonal(matrix);

        return Math.abs(mainDiagonal - secondaryDiagonal);
    }

    private static int calculateSecondaryDiagonal(int[][] matrix) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][(matrix.length - 1) - i];
        }

        return sum;
    }

    private static int calculateMainDiagonal(int[][] matrix) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }

        return sum;
    }

    private static int[][] readMatrix(int dimension, Scanner scanner) {
        int[][] input = new int[dimension][];

        for (int i = 0; i < input.length; i++) {
            input[i] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        return input;
    }
}
