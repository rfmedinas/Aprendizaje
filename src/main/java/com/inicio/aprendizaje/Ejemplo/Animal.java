package com.inicio.aprendizaje.Ejemplo;

public class Animal {
    private String type;
    private String species;
    private String group;

    public Animal(String type, String species, String group) {
        this.type = type;
        this.species = species;
        this.group = group;
        System.out.println("It's Animal" +" "+ type +" "+ species +" " + group );
        }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}

