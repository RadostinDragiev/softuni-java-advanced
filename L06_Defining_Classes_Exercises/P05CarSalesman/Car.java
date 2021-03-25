package L06_Defining_Classes_Exercises.P05CarSalesman;

public class Car {
    private String model;
    private Engine engine;
    private int weight = -1;
    private String color = "n/a";

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public Car(String model, Engine engine, int weight) {
        this(model, engine);
        this.weight = weight;
    }

    public Car(String model, Engine engine, String color) {
        this(model, engine);
        this.color = color;
    }

    public Car(String model, Engine engine, int weight, String color) {
        this(model, engine, weight);
        this.color = color;
    }

    public String getWeight() {
        String returnStatement;
        if (weight == -1) {
            return returnStatement = "n/a";
        }
        return String.valueOf(weight);
    }

    @Override
    public String toString() {
        String carModel = String.format("%s:", this.model);
        String engine = String.format("%s:", this.engine.getModel());
        String power = String.format("Power: %d", this.engine.getPower());
        String displacement = String.format("Displacement: %s", this.engine.getDisplacement());
        String efficiency = String.format("Efficiency: %s", this.engine.getEfficiency());
        String weight = String.format("Weight: %s", this.getWeight());
        String color = String.format("Color: %s", this.color);
        return String.format("%s%n%s%n%s%n%s%n%s%n%s%n%s%n", carModel, engine, power, displacement, efficiency, weight, color);
    }
}
