package L02_Multidimensional_Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P05MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        int rows = dimensions[0];
        int columns = dimensions[1];

        int[][] matrix = readMatrix(rows, columns, scanner);

        findBiggestSum(matrix);
        System.out.println();
    }

    private static void findBiggestSum(int[][] matrix) {
        int sumMax = Integer.MIN_VALUE;
        int[][] subMatrixMax = new int[2][2];

        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                int checkSum = (matrix[i][j] + matrix[i][j + 1]) + (matrix[i + 1][j] + matrix[i + 1][j +1]);
                if (checkSum > sumMax) {
                    sumMax = checkSum;
                    subMatrixMax[0][0] = matrix[i][j];
                    subMatrixMax[0][1] = matrix[i][j + 1];
                    subMatrixMax[1][0] = matrix[i + 1][j];
                    subMatrixMax[1][1] = matrix[i + 1][j + 1];
                }
            }
        }

        printResult(sumMax, subMatrixMax);
    }

    private static void printResult(int sumMax, int[][] subMatrixMax) {
        for (int i = 0; i < subMatrixMax.length; i++) {
            for (int j = 0; j < subMatrixMax[i].length; j++) {
                System.out.printf("%d ", subMatrixMax[i][j]);
            }
            System.out.println();
        }
        System.out.println(sumMax);
    }


    private static int[][] readMatrix(int rows, int columns, Scanner scanner) {
        int[][] input = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            input[i] = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        return input;
    }
}
