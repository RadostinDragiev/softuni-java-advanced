package L02_Multidimensional_Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P01CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] firstMatrix = readMatrix(scanner);
        int[][] secondMatrix = readMatrix(scanner);

        boolean areMatrixEqual = compareMatrix(firstMatrix, secondMatrix);


        if (areMatrixEqual) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    private static boolean compareMatrix(int[][] firstMatrix, int[][] secondMatrix) {
        boolean areEqual = true;

        if (firstMatrix.length != secondMatrix.length) {
            areEqual = false;
        } else {
            for (int i = 0; i < firstMatrix.length; i++) {
                if (firstMatrix[i].length != secondMatrix[i].length) {
                    areEqual = false;
                    break;
                } else {
                    for (int j = 0; j < firstMatrix[i].length; j++) {
                        if (firstMatrix[i][j] != secondMatrix[i][j]) {
                            return false;
                        }
                    }
                }
            }
        }

        return areEqual;
    }

    private static int[][] readMatrix(Scanner scanner) {
        int[] rowsAndColsInput = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = rowsAndColsInput[0];
        int cols = rowsAndColsInput[1];

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] input = scanner.nextLine().split("\\s+");
            for (int col = 0; col < input.length; col++) {
                matrix[row][col] = Integer.parseInt(input[col]);
            }
        }
        return matrix;
    }
}
