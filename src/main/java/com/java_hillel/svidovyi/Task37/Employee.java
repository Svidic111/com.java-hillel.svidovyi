package com.java_hillel.svidovyi.Task37;

public class Employee {
    private String name;
    private long salary; // it holds in copeecs(cents).
    private int age;
    private Gender gender;
    private boolean married;

    public Employee(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    @Override
    public String toString() {
        return this.getName() + ", " + this.getAge();
    }
}
