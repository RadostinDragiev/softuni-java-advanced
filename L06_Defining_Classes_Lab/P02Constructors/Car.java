package L06_Defining_Classes_Lab.P02Constructors;

public class Car {
    private String make;
    private String model;
    private int horsePowers;

    public Car(String make) {
        this.make = make;
        this.model = "unknown";
        this.horsePowers = -1;
    }

    public Car(String make, String model, int horsePowers) {
        this(make);
        this.model = model;
        this.horsePowers = horsePowers;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePowers() {
        return horsePowers;
    }

    public void setHorsePowers(int horsePowers) {
        this.horsePowers = horsePowers;
    }

    public String carInfo() {
        return this.toString();
    }

    public String toString() {
        return String.format("The car is: %s %s - %d HP.", this.getMake(), this.getModel(), this.getHorsePowers());
    }
}
