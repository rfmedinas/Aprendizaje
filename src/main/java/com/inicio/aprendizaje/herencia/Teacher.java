package com.inicio.aprendizaje.herencia;

public class Teacher extends Person {
	private int marks;
	private School school;

	public Teacher(String name, String lastName) {
		super(name, lastName);
		System.out.println("I am a Teacher " + name + " " + lastName);
	}
	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

}
