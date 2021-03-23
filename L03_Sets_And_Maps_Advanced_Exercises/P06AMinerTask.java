package L03_Sets_And_Maps_Advanced_Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P06AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, Integer> inventory = new LinkedHashMap<>();
        while (!input.equals("stop")) {
            String recourse = input;
            int quantity = Integer.parseInt(scanner.nextLine());

            if (inventory.containsKey(recourse)) {
                inventory.put(recourse, inventory.get(recourse) + quantity);
            } else {
                inventory.put(recourse, quantity);
            }

            input = scanner.nextLine();
        }

        inventory.entrySet().stream().forEach(x -> System.out.printf("%s -> %d%n", x.getKey(), x.getValue()));
    }
}
