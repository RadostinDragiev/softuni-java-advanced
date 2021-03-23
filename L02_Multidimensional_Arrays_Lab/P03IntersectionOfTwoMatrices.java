package L02_Multidimensional_Arrays_Lab;

import java.util.Scanner;

public class P03IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        String[][] firstMatrix = readMatrix(rows, columns, scanner);
        String[][] secondMatrix = readMatrix(rows, columns, scanner);

        String[][] thirdMatrix = compareMatrix(firstMatrix, secondMatrix, rows, columns);

        printMatrix(thirdMatrix);
    }

    private static void printMatrix(String[][] thirdMatrix) {
        for (int i = 0; i < thirdMatrix.length; i++) {
            System.out.println(String.join(" ", thirdMatrix[i]));
        }
    }

    private static String[][] compareMatrix(String[][] firstMatrix, String[][] secondMatrix, int rows, int columns) {
        String[][] thirdMatrix = new String[rows][columns];

        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix[i].length; j++) {
                if (firstMatrix[i][j].equals(secondMatrix[i][j])) {
                    thirdMatrix[i][j] = firstMatrix[i][j];
                } else {
                    thirdMatrix[i][j] = "*";
                }
            }
        }

        return thirdMatrix;
    }

    private static String[][] readMatrix(int rows, int columns, Scanner scanner) {
        String[][] input = new String[rows][columns];

        for (int i = 0; i < rows; i++) {
            String[] inputLine = scanner.nextLine().split("\\s+");
            for (int j = 0; j < columns; j++) {
                input[i][j] = inputLine[j];
            }
        }

        return input;
    }
}
