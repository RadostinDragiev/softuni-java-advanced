package L06_Defining_Classes_Exercises.P04RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int carsCount = Integer.parseInt(scanner.nextLine());

        List<Car> park = new ArrayList<>();
        for (int i = 0; i < carsCount; i++) {
            String[] input = scanner.nextLine().split("\\s+");

            String model = input[0];
            int engineSpeed = Integer.parseInt(input[1]);
            int enginePower = Integer.parseInt(input[2]);
            int cargoWeight = Integer.parseInt(input[3]);
            String cargoType = input[4];

            List<Tyre> thisCarTyres = new ArrayList<>();
            for (int j = 5; j < input.length; j += 2) {
                double tyrePressure = Double.parseDouble(input[j]);
                int age = Integer.parseInt(input[j + 1]);

                thisCarTyres.add(new Tyre(tyrePressure, age));
            }

            park.add(new Car(model, new Engine(engineSpeed, enginePower), new Cargo(cargoWeight, cargoType), thisCarTyres));
        }

        String inputCommand = scanner.nextLine();
        if (inputCommand.equals("fragile")) {
            park.stream().forEach(x -> {
                if (x.getCargoType().equals("fragile") && x.isTyreBelowOnePresent()) {
                    System.out.println(x.getModel());
                }
            });
        } else {
            park.stream().forEach(x -> {
                if (x.getCargoType().equals("flamable") && x.getEnginePower() > 250) {
                    System.out.println(x.getModel());
                }
            });
        }
    }
}
