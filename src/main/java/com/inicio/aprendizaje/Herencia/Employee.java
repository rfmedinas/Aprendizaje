package com.inicio.aprendizaje.Herencia;

import java.math.BigDecimal;

public class Employee extends  Person{
    private String title;
    private BigDecimal salary;
    private Person employer;
    public Employee(String name, String lastName) {
        super(name, lastName);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Person getEmployer() {
        return employer;
    }

    public void setEmployer(Person employer) {
        this.employer = employer;
    }
}
