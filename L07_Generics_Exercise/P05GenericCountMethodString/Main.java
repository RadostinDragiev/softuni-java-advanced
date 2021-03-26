package L07_Generics_Exercise.P05GenericCountMethodString;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Box<String>> boxes = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            boxes.add(new Box<>(scanner.nextLine()));

        }

        Box<String> box = new Box<>(scanner.nextLine());
        System.out.println(findAllOccurrences(boxes, box));
    }

    private static<T extends Comparable> long findAllOccurrences(List<Box<T>> boxes, Box<T> box) {
        return boxes.stream().filter(x -> x.getElement().compareTo(box.getElement()) > 0).count();
    }

}