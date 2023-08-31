package com.inicio.aprendizaje.Herencia;

public class Teacher extends Person {
  private  School school;
    public Teacher(String name, String lastName, School school) {
        super(name, lastName);
        this.school =school;
        System.out.println("iam Teacher "+name +" " +lastName +" " + school);
    }
    public Teacher (Person person){
        super(person.getName(), person.getLastName());

    }
    @Override
    public void eat() {

        System.out.println(super.getName() + " Comiendo. y soy profesor"                                                                                                                                                );
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
