package com.inicio.aprendizaje.Ejemplo;

public class LandAnimal extends Animal {
    private  int id;

    public LandAnimal(String type, String species, String group,int id) {
        super(type,species,group);
        this.id=id ;
        System.out.println("it's Animal  "+type +" " +species + " " +group);
    }

    public int getId() {
        return id;
    }
}
