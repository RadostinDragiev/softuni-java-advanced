package L06_Defining_Classes_Exercises.P04RawData;

public class Tyre {
    private double tyrePressure;
    private int tyreAge;

    public Tyre(double pressure, int age) {
        this.tyrePressure = pressure;
        this.tyreAge = age;
    }

    public double getTyrePressure() {
        return tyrePressure;
    }
}
