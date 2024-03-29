package L06_Defining_Classes_Exercises.P07Google;

public class Company {
    private String companyName;
    private String department;
    private double salary;

    public Company(String companyName, String department, double salary) {
        this.companyName = companyName;
        this.department = department;
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        if (companyName.isEmpty()) {
            return "";
        } else {
            return String.format("%s %s %.2f", this.companyName, this.department, this.salary);
        }
    }
}
