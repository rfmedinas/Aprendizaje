package com.inicio.aprendizaje.Herencia;

public class PersonRunner {
    public static void main(String[] args) {
        Person person =new Person("Raúl","Medina");
        Student student= new Student("José","Gomez",111);
        Student raul= new Student(person.getName(), person.getLastName(), 222);
        Student raulf= new Student(person, 333);
        raulf.eat();
        School school =new School(50,"UNAD" );
        Teacher teacher = new Teacher("Pepito","Perez",school);
        teacher.eat();
    }
}
