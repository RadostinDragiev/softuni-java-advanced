package L03_Sets_And_Maps_Advanced_Lab;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P08AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        Map<String, Double> studentsDatabase = new TreeMap<>();
        for (int i = 0; i < numberOfStudents; i++) {
            String studentName = scanner.nextLine();
            double[] grades = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();

            int amountOfGrades = grades.length;
            double sumOfGrades = 0;
            for (int j = 0; j < amountOfGrades; j++) {
                sumOfGrades += grades[j];
            }
            double avgGrade = sumOfGrades / amountOfGrades;

            studentsDatabase.put(studentName, avgGrade);
        }

        studentsDatabase.entrySet().stream().forEach(x -> System.out.printf("%s is graduated with %s%n", x.getKey(), x.getValue()));
    }
}
