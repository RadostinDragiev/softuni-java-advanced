package L06_Defining_Classes_Exercises.P02CompanyRoster;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Employee> departmentMembers;

    public Department(String department) {
        this.name = department;
        this.departmentMembers = new ArrayList<>();
    }

    public List<Employee> getDepartmentMembers() {
        return departmentMembers;
    }

    public double averageSalary() {
        return this.departmentMembers
                .stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);
    }

    public String getName() {
        return name;
    }
}
