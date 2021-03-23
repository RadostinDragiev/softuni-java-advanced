package L02_Multidimensional_Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P02PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int columns = dimensions[1];

        int[][] matrix = readMatrix(rows, columns, scanner);

        int numberToLookFor = Integer.parseInt(scanner.nextLine());

        findNumber(matrix, numberToLookFor);
    }

    private static void findNumber(int[][] matrix, int numberToLookFor) {
        boolean isFound = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == numberToLookFor) {
                    isFound = true;
                    System.out.printf("%d %d%n", i, j);
                }
            }
        }

        if (!isFound) {
            System.out.println("not found");
        }
    }

    private static int[][] readMatrix(int rows, int columns, Scanner scanner) {
        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }
        return matrix;
    }
}
