package L06_Defining_Classes_Exercises.P06PokemonTrainer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Trainer> trainers = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equals("Tournament")) {
            //TrainerName(Set), PokemonName, PokemonElement, PokemonHealth
            String[] tokens = input.split("\\s+");
            String trainerName = tokens[0];
            String pokemonName = tokens[1];
            String pokemonElement = tokens[2];
            int pokemonHealth = Integer.parseInt(tokens[3]);

            Pokemon newPokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);
            boolean trainerIsPresent = false;
            int trainerIndex = -1;
            for (int i = 0; i< trainers.size(); i++) {
                if (trainers.get(i).getTrainerName().equals(trainerName)) {
                    trainerIsPresent = true;
                    trainerIndex = i;
                    break;
                }
            }
            if (!trainerIsPresent) {
                trainers.add(new Trainer(trainerName, newPokemon));
            } else {
                trainers.get(trainerIndex).setPokemons(newPokemon);

            }

            input = scanner.nextLine();
        }

        String elementCommands = scanner.nextLine();
        while (!elementCommands.equals("End")) {
            //one of tree -> Fire, Water, Electricity
            //if Trainer have >= 1 pokemon with element -> +1 badge
            //else Trainer pokemons -= 10Health
            //if pokemon health >= 0 -> delete pokemon
            String element = elementCommands;
            trainers.stream().forEach(x -> {
                final boolean[] trainerPokemonsContainsElement = {false};
                x.getPokemons().stream().forEach(y -> {
                    if (y.getElement().equals(element)) {
                        trainerPokemonsContainsElement[0] = true;
                    }
                });

                if (trainerPokemonsContainsElement[0]) {
                    x.setNumberOfBadges(1);
                } else {
                    x.getPokemons().stream().forEach(Pokemon::loseHealth);
                    x.modifyPokemonsHealth();
                }
            });

            elementCommands = scanner.nextLine();
        }

        //Print: see word
        System.out.println();
        trainers.stream().sorted((f, s) -> s.getNumberOfBadges() - f.getNumberOfBadges()).forEach(x -> System.out.println(x.toString()));
    }
}
