package com.inicio.aprendizaje.herencia;

public class Student extends Person{
    private int studentId;

    public Student(String name, String lastName, int studentId) {
        super(name, lastName);
        this.studentId = studentId;
        System.out.println("I am a Student " + name + " " + lastName);

    }
    public Student(Person person) {
        super(person);
        System.out.println("I am a Student " + person.getName() + " " + person.getLastName());
    }
    public int getStudentId() {
        return studentId;
    }
}
