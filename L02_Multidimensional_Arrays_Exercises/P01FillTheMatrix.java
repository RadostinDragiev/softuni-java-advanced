package L02_Multidimensional_Arrays_Exercises;

import java.util.Scanner;

public class P01FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int dimension = Integer.parseInt(input[0]);
        char type = input[1].charAt(0);

        int[][] matrix = new int[dimension][dimension];
        switch (type) {
            case 'A':
                matrix = typeA(matrix);
                break;
            case 'B':
                matrix = typeB(matrix);
                break;
        }

        printResult(matrix);
    }

    private static void printResult(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }


    private static int[][] typeA(int[][] matrix) {
        int[][] input = new int[matrix.length][matrix.length];

        int number = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                input[i][j] = number++;
            }
        }

        return input;
    }

    private static int[][] typeB(int[][] matrix) {
        int[][] input = new int[matrix.length][matrix.length];
        int number = 1;

        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix.length; j++) {
                    input[i][j] = number++;
                }
            } else {
                int reversedNumber = (number - 1) + matrix.length;
                for (int j = 0; j < matrix.length; j++) {
                    input[i][j] = reversedNumber--;
                    number++;
                }
            }
        }

        return input;
    }
}
