package L06_Defining_Classes_Exercises.P07Google;

public class Parent {
    private String parentName;
    private String parentBDay;

    public Parent(String parentName, String parentBDay) {
        this.parentName = parentName;
        this.parentBDay = parentBDay;
    }

    public String getParentName() {
        return parentName;
    }

    public String getParentBDay() {
        return parentBDay;
    }
}
