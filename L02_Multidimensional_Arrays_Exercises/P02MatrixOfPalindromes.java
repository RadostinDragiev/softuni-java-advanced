package L02_Multidimensional_Arrays_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P02MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] size = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int rows = size[0];
        int columns = size[1];

        String[][] matrix = iterateMatrix(rows, columns);

        printMatrix(matrix);
    }

    private static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%s ", matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static String[][] iterateMatrix(int rows, int columns) {
        char firstChar = 'a';
        char thirdChar = 'a';

        String[][] input = new String[rows][columns];
        for (int i = 0; i < rows; i++) {
            char secondChar = (char) ('a' + i);
            for (int j = 0; j < columns; j++) {
                StringBuilder concatenateInput = new StringBuilder();
                concatenateInput.append(firstChar);
                concatenateInput.append(secondChar++);
                concatenateInput.append(thirdChar);
                input[i][j] = concatenateInput.toString();
            }
            firstChar++;
            thirdChar++;
        }

        return input;
    }
}
