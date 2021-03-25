package L06_Defining_Classes_Exercises.P07Google;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Company company;
    private List<Pokemon> pokemons = new ArrayList<>();
    private List<Parent> parents = new ArrayList<>();
    private List<Child> childrens = new ArrayList<>();
    private Car car;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setPokemons(Pokemon pokemons) {
        this.pokemons.add(pokemons);
    }

    public void setParents(Parent parents) {
        this.parents.add(parents);
    }

    public void setChildrens(Child childrens) {
        this.childrens.add(childrens);
    }

    public Company getCompany() {
        return company;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public List<Parent> getParents() {
        return parents;
    }

    public List<Child> getChildrens() {
        return childrens;
    }

    public Car getCar() {
        return car;
    }
}
