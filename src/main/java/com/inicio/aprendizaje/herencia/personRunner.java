package com.inicio.aprendizaje.herencia;

public class personRunner {
    public static void main(String[] args) {
        Person person = new Person("Juan", "Perez");
        Student student = new Student("Pedro", "Perez", 123);
        Teacher teacher = new Teacher("Maria", "Perez");
        Student student2 = new Student(person);

    }
}
