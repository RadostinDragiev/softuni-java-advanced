package L06_Defining_Classes_Lab.P01CarInfo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int carNumbers = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < carNumbers; i++) {
            Car current = new Car();
            String[] carParts = scanner.nextLine().split("\\s+");
            current.setMake(carParts[0]);
            current.setModel(carParts[1]);
            current.setHorsePower(Integer.parseInt(carParts[2]));

            System.out.println(current.carInfo());
        }
    }
}
