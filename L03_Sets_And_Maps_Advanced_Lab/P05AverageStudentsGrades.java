package L03_Sets_And_Maps_Advanced_Lab;

import java.util.*;

public class P05AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentsAndGrades = new TreeMap<>();
        for (int i = 0; i < numberOfStudents; i++) {
            String[] input = scanner.nextLine().split("\\s+");

            String name = input[0];
            double currentGrade = Double.parseDouble(input[1]);

            List<Double> currentStudentGrades = new ArrayList<>();
            if (studentsAndGrades.containsKey(name)) {
                currentStudentGrades = studentsAndGrades.get(name);
                currentStudentGrades.set(0, currentStudentGrades.get(0) + 1);
                currentStudentGrades.add(currentGrade);
                studentsAndGrades.put(name, currentStudentGrades);
            } else {
                currentStudentGrades.add(0, 1.0);
                currentStudentGrades.add(currentGrade);
                studentsAndGrades.put(name, currentStudentGrades);
            }
        }

        studentsAndGrades.entrySet().stream().forEach((key -> {
            System.out.printf("%s ->",key.getKey());
            double sum = 0;
            for (int i = 1; i < key.getValue().size(); i++) {
                sum += key.getValue().get(i);
                System.out.printf(" %.2f", key.getValue().get(i));
            }
            System.out.printf(" (avg: %.2f)%n", sum / key.getValue().get(0));
        }));
    }
}
