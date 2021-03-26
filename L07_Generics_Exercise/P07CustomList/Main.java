package L07_Generics_Exercise.P07CustomList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SmartList<String> smartList = new SmartList<>();

        String line = scanner.nextLine();
        while (!line.equals("END")) {
            String[] commands = line.split("\\s+");

            switch (commands[0]) {
                case "Add":
                    smartList.add(commands[1]);
                    break;
                case "Remove":
                    smartList.remove(Integer.parseInt(commands[1]));
                    break;
                case "Contains":
                    System.out.println(smartList.contains(commands[1]));
                    break;
                case "Swap":
                    smartList.swap(Integer.parseInt(commands[1]),
                                    Integer.parseInt(commands[2]));
                    break;
                case "Greater":
                    System.out.println(smartList.countGreaterThan(commands[1]));
                    break;
                case "Max":
                    System.out.println(smartList.getMax());
                    break;
                case "Min":
                    System.out.println(smartList.getMin());
                    break;
                case "Print":
                    smartList.forEach(System.out::println);
                    break;
            }

            line = scanner.nextLine();
        }
    }
}