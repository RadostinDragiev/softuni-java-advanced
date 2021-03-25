package L06_Defining_Classes_Exercises.P05CarSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Engine> engines = new ArrayList<>();
        int enginesCount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < enginesCount; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            //model, power, disp, eff
            String model = input[0];
            int power = Integer.parseInt(input[1]);
            int displacement;
            String efficiency;

            if (input.length == 2) {
                engines.add(new Engine(model, power));
            } else if (input.length == 4) {
                engines.add(new Engine(model, power, Integer.parseInt(input[2]), input[3]));
            } else {
                try {
                    displacement = Integer.parseInt(input[2]);
                    engines.add(new Engine(model, power, displacement));
                } catch (NumberFormatException e) {
                    efficiency = input[2];
                    engines.add(new Engine(model, power, efficiency));
                }
            }
        }

        List<Car> carsPark = new ArrayList<>();
        int carsCount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < carsCount; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            //model, engine, weight, color
            String model = input[0];
            String engine = input[1];
            int weight;
            String color;

            int indexOfEngine = getIndexOfEngine(engines, engine);

            if (input.length == 2) {
                carsPark.add(new Car(model, engines.get(indexOfEngine)));
            } else if (input.length == 4) {
                carsPark.add(new Car(model, engines.get(indexOfEngine), Integer.parseInt(input[2]), input[3]));
            } else {
                try {
                    weight = Integer.parseInt(input[2]);
                    carsPark.add(new Car(model, engines.get(indexOfEngine), weight));
                } catch (NumberFormatException e) {
                    carsPark.add(new Car(model, engines.get(indexOfEngine), input[2]));
                }
            }
        }

        carsPark.stream().forEach(x -> {
            System.out.print(x.toString());
        });
    }

    private static int getIndexOfEngine(List<Engine> engines, String engine) {
        int index = -1;
        for (int i = 0; i < engines.size(); i++) {
            String en = engines.get(i).getModel();
            if (en.equals(engine)) {
                index = i;
            }
        }

        return index;
    }
}
