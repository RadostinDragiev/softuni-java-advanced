package L02_Multidimensional_Arrays_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P04MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimension = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int rows = dimension[0];
        int columns = dimension[1];

        int[][] matrix = readMatrix(rows, columns, scanner);

        findMaxSum(matrix);
    }

    private static void findMaxSum(int[][] matrix) {
        int sumMax = Integer.MIN_VALUE;
        int[] matrixMax = new int[2];

        for (int i = 0; i < matrix.length - 2; i++) {
            for (int j = 0; j < matrix[i].length - 2; j++) {
                int currentSum = matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2]
                        + matrix[i + 1][j] + matrix[i + 1][j + 1] + matrix[i + 1][j + 2]
                        + matrix[i + 2][j] + matrix[i + 2][j + 1] + matrix[i + 2][j + 2];
                if (currentSum > sumMax){
                    sumMax = currentSum;
                    matrixMax[0] = i;
                    matrixMax[1] = j;
                }
            }
        }

        printResult(sumMax, matrixMax, matrix);
    }

    private static void printResult(int sumMax, int[] matrixMax, int[][] matrix) {
        System.out.printf("Sum = %d%n",sumMax);
        for (int i = matrixMax[0]; i < matrixMax[0] + 3; i++) {
            for (int j = matrixMax[1]; j < matrixMax[1] + 3; j++) {
                System.out.printf("%d ",matrix[i][j]);
            }
            System.out.println();
        }

    }

    private static int[][] readMatrix(int rows, int columns, Scanner scanner) {
        int[][] input = new int[rows][columns];

        for (int i = 0; i < input.length; i++) {
            input[i] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        return input;
    }
}
