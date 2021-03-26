package L08_Iterators_And_Comparators_Exercise.P06StrategyPattern;

import java.util.Comparator;

public class PeopleComparatorByAge implements Comparator<Person> {
    @Override
    public int compare(Person first, Person second) {
        return first.getAge() - second.getAge();
    }
}
