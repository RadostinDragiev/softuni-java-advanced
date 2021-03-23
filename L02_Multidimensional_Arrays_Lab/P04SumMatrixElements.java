package L02_Multidimensional_Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P04SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        int rows = dimensions[0];
        int columns = dimensions[1];

        int[][] matrix = readMatrix(rows, columns, scanner);

        printMatrixResult(matrix, rows, columns);

        System.out.println();
    }

    private static void printMatrixResult(int[][] matrix, int rows, int columns) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }

        System.out.println(rows);
        System.out.println(columns);
        System.out.println(sum);
    }

    private static int[][] readMatrix(int rows, int columns, Scanner scanner) {
        int[][] input = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            input[i] = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        return input;
    }
}
