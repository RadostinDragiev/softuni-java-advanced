package L06_Defining_Classes_Exercises.P02CompanyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());

        Map<String, Department> companyDepartments = new HashMap<>();
        for (int i = 0; i < count; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String department = input[3];
            String email;
            int age;

            //Length check
            Employee employee;
            if (input.length == 4) {
                employee = new Employee(name, salary, position, department);
            } else if (input.length == 6) {
                employee = new Employee(name, salary, position, department, input[4], Integer.parseInt(input[5]));
            } else {
                try {
                    age = Integer.parseInt(input[4]);
                    employee = new Employee(name, salary, position, department, age);
                } catch (NumberFormatException e) {
                    email = input[4];
                    employee = new Employee(name, salary, position, department, email);
                }
            }

            companyDepartments.putIfAbsent(department, new Department(department));
            companyDepartments.get(department).getDepartmentMembers().add(employee);
        }

        Department maxDepartment = companyDepartments
                .entrySet()
                .stream()
                .max(Comparator.comparing(f -> f.getValue().averageSalary()))
                .get()
                .getValue();

        maxDepartment.getDepartmentMembers().sort((f, s) -> Double.compare(s.getSalary(), f.getSalary()));

        System.out.printf("Highest Average Salary: %s%n", maxDepartment.getName());
        maxDepartment.getDepartmentMembers().stream().forEach(x -> System.out.println(x.toString()));
    }
}
