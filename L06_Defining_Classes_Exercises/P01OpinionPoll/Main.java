package L06_Defining_Classes_Exercises.P01OpinionPoll;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());

        Set<Person> book = new HashSet<>();
        for (int i = 0; i < count; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            int age = Integer.parseInt(input[1]);

            Person current = new Person(name, age);
            book.add(current);
        }

        book.stream().sorted((x, y) -> x.getName().compareTo(y.getName())).forEach(x -> {
            if (x.getAge() > 30) {
                System.out.printf("%s - %d%n", x.getName(), x.getAge());
            }
        });
    }
}
