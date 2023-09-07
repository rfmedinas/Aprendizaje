package com.inicio.aprendizaje.Herencia;

public class Student extends Person{
    private  int studentId;
    public Student(String name, String lastName, int studentId) {
        super(name, lastName);
        this.studentId = studentId;
        System.out.println("Entro por name");
        System.out.println("iam Student "+name +" " +lastName);
    }
    public Student(Person person,int studentId){
        super(person.getName(), person.getLastName());
        this.studentId = studentId;
        System.out.println("iam Student "+person.getName()+" " +person.getLastName());
        System.out.println("Entro por Person");
    }

    public int getStudentId() {
        return studentId;
    }
}
