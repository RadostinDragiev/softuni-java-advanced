package L03_Sets_And_Maps_Advanced_Lab;

import java.util.*;

public class P06ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, Map<String, Double>> database = new TreeMap<>();
        while (!input.equals("Revision")) {
            String[] tokens = input.split(", ");
            String shop = tokens[0];
            String product = tokens[1];
            double price = Double.parseDouble(tokens[2]);

            Map<String, Double> currentProducts = new LinkedHashMap<>();
            if (!database.containsKey(shop)) {
                currentProducts.put(product, price);
                database.put(shop, currentProducts);
            } else {
                currentProducts = database.get(shop);
                currentProducts.put(product, price);
                database.put(shop, currentProducts);
            }

            input = scanner.nextLine();
        }

        database.entrySet().stream().forEach(x -> {
            System.out.printf("%s->%n", x.getKey());
            x.getValue().entrySet().stream().forEach(y -> {
                System.out.printf("Product: %s, Price: %.1f%n", y.getKey(), y.getValue());
            });
        });
    }
}
