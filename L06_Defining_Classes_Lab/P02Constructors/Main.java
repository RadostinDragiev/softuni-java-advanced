package L06_Defining_Classes_Lab.P02Constructors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int carCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < carCount; i++) {
            String[] lookingFor = scanner.nextLine().split("\\s+");

            Car current;
            if (lookingFor.length == 1) {
                current = new Car(lookingFor[0]);
            } else {
                current = new Car(lookingFor[0], lookingFor[1], Integer.parseInt(lookingFor[2]));
            }

            System.out.println(current.toString());
        }
    }
}
