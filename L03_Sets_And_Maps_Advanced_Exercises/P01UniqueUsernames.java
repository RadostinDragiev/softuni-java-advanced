package L03_Sets_And_Maps_Advanced_Exercises;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P01UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfUsername = Integer.parseInt(scanner.nextLine());

        Set<String> usernames = new LinkedHashSet<>();
        for (int i = 0; i < countOfUsername; i++) {
            usernames.add(scanner.nextLine());
        }

        usernames.forEach(System.out::println);
    }
}