package L03_Sets_And_Maps_Advanced_Lab;

import java.util.*;

public class P02SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Set<String> vipGuests = new TreeSet<>();
        Set<String> regularGuests = new TreeSet<>();
        while (!input.equals("PARTY")) {
            if (input.length() == 8) {
                if (Character.isDigit(input.charAt(0))) {
                    vipGuests.add(input);
                } else {
                    regularGuests.add(input);
                }
            }

            input = scanner.nextLine();
        }

        while (!input.equals("END")) {
            if (vipGuests.contains(input)) {
                vipGuests.remove(input);
            } else if (regularGuests.contains(input)) {
                regularGuests.remove(input);
            }

            input = scanner.nextLine();
        }

        System.out.printf("%d%n", vipGuests.size() + regularGuests.size());
        vipGuests.forEach(System.out::println);
        regularGuests.forEach(System.out::println);
    }
}
