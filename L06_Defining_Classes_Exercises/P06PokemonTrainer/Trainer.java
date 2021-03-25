package L06_Defining_Classes_Exercises.P06PokemonTrainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    //name, number of badges(0), collection of pokemons
    private String trainerName;
    private int numberOfBadges = 0;
    private List<Pokemon> pokemons;

    public Trainer(String trainerName,Pokemon pokemons) {
        this.trainerName = trainerName;
        this.pokemons = new ArrayList<>();
        this.pokemons.add(pokemons);
    }

    public String getTrainerName() {
        return trainerName;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(Pokemon pokemons) {
        this.pokemons.add(pokemons);
    }

    public int getNumberOfBadges() {
        return numberOfBadges;
    }

    public void setNumberOfBadges(int numberOfBadges) {
        this.numberOfBadges += numberOfBadges;
    }

    public void modifyPokemonsHealth() {
        for (int i = 0; i < pokemons.size(); i++) {
            if (pokemons.get(i).getHealth() <= 0) {
                pokemons.remove(pokemons.get(i));
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%s %d %d", this.trainerName, this.numberOfBadges, this.pokemons.size());
    }
}
