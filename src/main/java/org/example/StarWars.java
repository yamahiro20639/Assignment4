package org.example;

public class StarWars {
    private String characterName;
    private String planet;

    public String total() {
        return getCharacterName() + getPlanet();
    }

    public String getCharacterName() {
        return this.characterName;
    }

    public String getPlanet() {
        return this.planet;
    }

    StarWars(String characterName, String planet) {
        this.characterName = characterName;
        this.planet = planet;

    }
}