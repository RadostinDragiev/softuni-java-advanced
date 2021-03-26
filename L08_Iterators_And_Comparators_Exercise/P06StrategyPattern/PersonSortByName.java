package L08_Iterators_And_Comparators_Exercise.P06StrategyPattern;

import java.util.Comparator;

public class PersonSortByName implements Comparator<Person> {
    @Override
    public int compare(Person first, Person second) {
        int result = first.getName().length() - second.getName().length();

        if (result == 0) {
            char f = Character.toLowerCase(first.getName().charAt(0));
            char s = Character.toLowerCase(second.getName().charAt(0));

            result = Character.compare(f, s);
        }

        return result;
    }
}
