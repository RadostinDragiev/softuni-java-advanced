package L03_Sets_And_Maps_Advanced_Lab;

import java.util.*;

public class P07CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCountries = Integer.parseInt(scanner.nextLine());

        Map<String, Map<String, List<String>>> countriesDatabase = new LinkedHashMap<>();
        for (int i = 0; i < numberOfCountries; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String continent = input[0];
            String country = input[1];
            String town = input[2];

            Map<String, List<String>> currentContinent = new LinkedHashMap<>();
            if (countriesDatabase.containsKey(continent)) {
                currentContinent = countriesDatabase.get(continent);
                List<String> currentTownsAtCountry = new ArrayList<>();
                if (currentContinent.containsKey(country)) {
                    currentTownsAtCountry = currentContinent.get(country);
                    currentTownsAtCountry.add(town);
                } else {
                    currentTownsAtCountry.add(town);
                    currentContinent.put(country, currentTownsAtCountry);
                }

                currentContinent.put(country, currentTownsAtCountry);
                countriesDatabase.put(continent, currentContinent);
            } else {
                List<String> currentTown = new ArrayList<>();
                currentTown.add(town);
                currentContinent.put(country, currentTown);
                countriesDatabase.put(continent, currentContinent);
            }

        }

        countriesDatabase.entrySet().forEach(x -> {
            System.out.printf("%s:%n", x.getKey());
            x.getValue().entrySet().forEach(y -> {
                System.out.printf(" %s -> %s%n", y.getKey(), String.join(", ", y.getValue()));
            });
        });
    }
}
