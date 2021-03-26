package L07_Generics_Exercise.P04GenericSwapMethodInteger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Box<Integer>> boxes = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            boxes.add(new Box<>(Integer.parseInt(scanner.nextLine())));

        }

        String[] command = scanner.nextLine().split("\\s+");
        int firstIndex = Integer.parseInt(command[0]);
        int secondIndex = Integer.parseInt(command[1]);

        swapPositions(boxes, firstIndex, secondIndex);

        boxes.forEach(x -> System.out.println(x.toString()));
    }

    public static<T> void swapPositions(List<Box<T>> boxes, int firstIndex, int secondIndex) {
        Collections.swap(boxes, firstIndex, secondIndex);
    }
}