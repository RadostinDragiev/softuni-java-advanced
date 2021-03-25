package L06_Defining_Classes_Exercises.P07Google;

public class Child {
    private String childName;
    private String childBDay;

    public Child(String childName, String childBDay) {
        this.childName = childName;
        this.childBDay = childBDay;
    }

    public String getChildName() {
        return childName;
    }

    public String getChildBDay() {
        return childBDay;
    }
}
