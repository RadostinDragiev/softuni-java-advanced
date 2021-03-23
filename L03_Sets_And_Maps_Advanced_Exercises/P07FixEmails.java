package L03_Sets_And_Maps_Advanced_Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P07FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, String> database = new LinkedHashMap<>();
        while (!input.equals("stop")) {
            String name = input;
            String email = scanner.nextLine();

            String domain = email.substring(email.lastIndexOf(".") + 1);
            if (!domain.equals("us") && !domain.equals("uk") && !domain.equals("com")) {
                database.put(name, email);
            }

            input = scanner.nextLine();
        }

        database.entrySet().stream().forEach(x -> System.out.printf("%s -> %s%n", x.getKey(), x.getValue()));
    }
}
