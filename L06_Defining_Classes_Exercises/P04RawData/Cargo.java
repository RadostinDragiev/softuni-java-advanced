package L06_Defining_Classes_Exercises.P04RawData;

public class Cargo {
    private int cargoWeight;
    private String cargoType;

    public Cargo(int weight, String type) {
        this.cargoWeight = weight;
        this.cargoType = type;
    }

    public String getCargoType() {
        return cargoType;
    }
}
