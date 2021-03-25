package L06_Defining_Classes_Exercises.P05CarSalesman;

public class Engine {
    private String model;
    private int power;
    private int displacement = -1;
    private String efficiency = "n/a";

    public Engine(String model, int power) {
        this.model = model;
        this.power = power;
    }

    public Engine(String model, int power, int displacement) {
        this(model, power);
        this.displacement = displacement;
    }

    public Engine(String model, int power, String efficiency) {
        this(model, power);
        this.efficiency = efficiency;
    }

    public Engine(String model, int power, int displacement, String efficiency) {
        this(model, power, displacement);
        this.efficiency = efficiency;
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public String getDisplacement() {
        String returnStatement;
        if (displacement == -1) {
            return returnStatement = "n/a";
        }
        return String.valueOf(displacement);
    }

    public String getEfficiency() {
        return efficiency;
    }
}
