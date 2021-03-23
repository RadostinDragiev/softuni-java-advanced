package L03_Sets_And_Maps_Advanced_Lab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P01ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        Set<String> parkingLot = new LinkedHashSet<>();
        while (!input.equals("END")) {
            String[] tokens = input.split(", ");
            String command = tokens[0];
            String carNumber = tokens[1];

            if (command.equals("IN")) {
                parkingLot.add(carNumber);
            } else if (command.equals("OUT")) {
                parkingLot.remove(carNumber);
            }

            input = scanner.nextLine();
        }

        if (parkingLot.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            parkingLot.forEach(System.out::println);
        }
    }
}
