package L06_Defining_Classes_Exercises.P03SpeedRacing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int linesCount = Integer.parseInt(scanner.nextLine());

        List<Car> carsPark = new ArrayList<>();
        for (int i = 0; i < linesCount; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String model = input[0];
            int fuelAmount = Integer.parseInt(input[1]);
            double fuelCoastFor1Km = Double.parseDouble(input[2]);

            carsPark.add(new Car (model, fuelAmount, fuelCoastFor1Km));
        }

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            String carModel = tokens[1];
            int amountOfKm = Integer.parseInt(tokens[2]);

            int indexOfCar = findIndexOfCar(carsPark, carModel);

            if (!carsPark.get(indexOfCar).isFuelEnough(amountOfKm)) {
                System.out.println("Insufficient fuel for the drive");
            }

            input = scanner.nextLine();
        }

        carsPark.stream().forEach(x -> System.out.println(x.toString()));
    }

    private static int findIndexOfCar(List<Car> park, String carModel) {
        int number = -1;
        for (int i = 0; i < park.size(); i++) {
            if (park.get(i).getCarModel().equals(carModel)) {
                number = i;
                break;
            }
        }
        return number;
    }
}
