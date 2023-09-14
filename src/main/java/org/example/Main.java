package org.example;

import java.util.Map;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {

        Map<String, StarWars> affiliation = new LinkedHashMap<>();

        affiliation.put("rebel alliance1", new StarWars("Luke Skywalker", "Tatooine"));
        affiliation.put("rebel alliance2", new StarWars("Han Solo", "Corellia"));
        affiliation.put("rebel alliance3", new StarWars("Leia Organa", "Alderaan"));
        affiliation.put("Galactic Empire1", new StarWars("Sheev Palpatine", "Naboo"));
        affiliation.put("Galactic Empire2", new StarWars("Darth Vade", "Tatooine"));
        affiliation.put("Galactic Empire3", new StarWars("Willhuf Tarkin", "Eriadu"));

        affiliation.entrySet().stream()
                .map(e -> "Affiliation:" + e.getKey() + "     " + "CharacterName:" + e.getValue().getCharacterName() + "     " + "Birthplace:" + e.getValue().getPlanet())
                .forEach(System.out::println);

    }
}

