package L08_Iterators_And_Comparators_Exercise.P05ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String[] tokens = input.split("\\s+");

            people.add(new Person(tokens[0], Integer.parseInt(tokens[1]), tokens[2]));

            input = scanner.nextLine();
        }

        int index = Integer.parseInt(scanner.nextLine()) - 1;
        Person person = people.get(index);

        int count = 0;
        for (Person p : people) {
            if (p.compareTo(person) == 0) {
                count++;
            }
        }

        if (count == 1) {
            System.out.println("No matches");
        } else {
            System.out.printf("%d %d %d", count, people.size() - count, people.size());
        }
    }
}
