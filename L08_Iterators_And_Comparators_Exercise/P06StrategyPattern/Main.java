package L08_Iterators_And_Comparators_Exercise.P06StrategyPattern;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Person> peopleByName = new TreeSet<>(new PersonSortByName());
        Set<Person> peopleByAge = new TreeSet<>(new PeopleComparatorByAge());

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");

            Person person = new Person(tokens[0], Integer.parseInt(tokens[1]));

            peopleByName.add(person);
            peopleByAge.add(person);

        }

        for (Person person : peopleByName) {
            System.out.println(person.toString());
        }

        for (Person person : peopleByAge) {
            System.out.println(person.toString());
        }
    }
}
