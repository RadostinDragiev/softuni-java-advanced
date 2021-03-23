package L02_Multidimensional_Arrays_Lab;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class P06PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int squareSize = Integer.parseInt(scanner.nextLine());

        int[][] matrix = readMatrix(squareSize, scanner);

        findDiagonals(matrix);

        System.out.println();
    }

    private static void findDiagonals(int[][] matrix) {
        int[][] diagonals = new int[2][matrix.length];

        ArrayDeque<Integer> backwardDiagonal = new ArrayDeque<>();
        for (int i = 0; i < matrix.length; i++) {
            diagonals[0][i] = matrix[i][i];
            backwardDiagonal.push(matrix[i][(matrix.length - 1) - i]);
        }

        for (int i = 0; i < matrix.length; i++) {
            diagonals[1][i] = backwardDiagonal.pop();
        }

        printResult(diagonals);
    }

    private static void printResult(int[][] diagonals) {
        for (int i = 0; i < diagonals.length; i++) {
            for (int j = 0; j < diagonals[i].length; j++) {
                System.out.printf("%d ", diagonals[i][j]);
            }
            System.out.println();
        }
    }

    private static int[][] readMatrix(int squareSize, Scanner scanner) {
        int[][] input = new int[squareSize][squareSize];

        for (int i = 0; i < squareSize; i++) {
            input[i] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        return input;
    }
}
