package L06_Defining_Classes_Exercises.P04RawData;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private List<Tyre> tyres;

    public Car(String model, Engine engine, Cargo cargo, List<Tyre> tyres) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tyres = new ArrayList<>();
        this.tyres = tyres;
    }

    public String getCargoType() {
        return this.cargo.getCargoType();
    }

    public boolean isTyreBelowOnePresent() {
        for (int i = 0; i < tyres.size(); i++) {
            if (tyres.get(i).getTyrePressure() < 1) {
                return true;
            }
        }
        return false;
    }

    public String getModel() {
        return model;
    }

    public int getEnginePower() {
        return this.engine.getEnginePower();
    }
}
