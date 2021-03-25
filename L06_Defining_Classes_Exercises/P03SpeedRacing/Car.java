package L06_Defining_Classes_Exercises.P03SpeedRacing;

public class Car {
    private String carModel;
    private double fuelAmount;
    private double fuelCoastPer1km;
    private int distanceTraveled = 0;

    public Car(String carModel, int fuelAmount, double fuelCoast) {
        this.carModel = carModel;
        this.fuelAmount = fuelAmount;
        this.fuelCoastPer1km = fuelCoast;
    }

    public boolean isFuelEnough(int distanceToTravel) {
        double fuelUsed = fuelCoastPer1km * distanceToTravel;
        if (fuelUsed <= fuelAmount) {
            fuelAmount -= fuelUsed;
            distanceTraveled += distanceToTravel;
            return true;
        } else {
            return false;
        }
    }

    public String getCarModel() {
        return carModel;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d", this.carModel, this.fuelAmount, this.distanceTraveled);
    }
}
