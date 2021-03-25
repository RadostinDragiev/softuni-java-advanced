package L06_Defining_Classes_Exercises.P07Google;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String COMPANY_COMMAND = "company";
        final String POKEMON_COMMAND = "pokemon";
        final String PARENTS_COMMAND = "parents";
        final String CHILDREN_COMMANDS = "children";
        final String CAR_COMMAND = "car";

        List<Person> groupOfPeople = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");

            String name = tokens[0];
            boolean personIsPresent = false;
            int indexOfPerson = -1;
            for (int i = 0; i < groupOfPeople.size(); i++) {
                if (groupOfPeople.get(i).getName().equals(name)) {
                    personIsPresent = true;
                    indexOfPerson = i;
                    break;
                }
            }

            Person person;
            if (!personIsPresent) {
                person = new Person(name);
                groupOfPeople.add(person);
            } else {
                person = groupOfPeople.get(indexOfPerson);
            }

            String command = tokens[1];
            switch (command) {
                case COMPANY_COMMAND:
                    String companyName = tokens[2];
                    String department = tokens[3];
                    double salary = Double.parseDouble(tokens[4]);
                    person.setCompany(new Company(companyName, department, salary));
                    break;
                case POKEMON_COMMAND:
                    String pokemonName = tokens[2];
                    String pokemonType = tokens[3];
                    person.setPokemons(new Pokemon(pokemonName, pokemonType));
                    break;
                case PARENTS_COMMAND:
                    String parentName = tokens[2];
                    String parentBDay = tokens[3];
                    person.setParents(new Parent(parentName, parentBDay));
                    break;
                case CHILDREN_COMMANDS:
                    String childName = tokens[2];
                    String childBDay = tokens[3];
                    person.setChildrens(new Child(childName, childBDay));
                    break;
                case CAR_COMMAND:
                    String carModel = tokens[2];
                    int carSpeed = Integer.parseInt(tokens[3]);
                    person.setCar(new Car(carModel, carSpeed));
                    break;
            }

            input = scanner.nextLine();
        }

        String personToPrint = scanner.nextLine();
        int indexOfPerson = -1;
        for (int i = 0; i < groupOfPeople.size(); i++) {
            if (groupOfPeople.get(i).getName().equals(personToPrint)) {
                indexOfPerson = i;
                break;
            }
        }
        System.out.println(groupOfPeople.get(indexOfPerson).getName());
        System.out.println("Company:");
        if (groupOfPeople.get(indexOfPerson).getCompany() != null) {
            System.out.println(groupOfPeople.get(indexOfPerson).getCompany().toString());
        }
        System.out.println("Car:");
        if (groupOfPeople.get(indexOfPerson).getCar() != null) {
            System.out.println(groupOfPeople.get(indexOfPerson).getCar().toString());
        }
        System.out.println("Pokemon:");
        groupOfPeople.get(indexOfPerson).getPokemons().stream().forEach(x -> {
            if (!x.getPokemonName().isEmpty()) {
                System.out.printf("%s %s%n", x.getPokemonName(), x.getPokemonType());
            }
        });
        System.out.println("Parents:");
        groupOfPeople.get(indexOfPerson).getParents().stream().forEach(x -> {
            if (!x.getParentName().isEmpty()) {
                System.out.printf("%s %s%n", x.getParentName(), x.getParentBDay());
            }
        });
        System.out.println("Children:");
        groupOfPeople.get(indexOfPerson).getChildrens().stream().forEach(x -> {
            System.out.printf("%s %s %n", x.getChildName(), x.getChildBDay());
        });
    }
}
