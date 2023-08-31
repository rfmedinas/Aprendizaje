package com.inicio.aprendizaje.herencia;

public class Person {
    private String name;
    private String lastName;
    private int age;
    private String email;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        System.out.println("I am a Person " + name + " " + lastName);
    }

    public Person(Person person){
        this.name = person.getName();
        this.lastName = person.getLastName();
        System.out.println("I am a Person " + name + " " + lastName);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
