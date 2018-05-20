package com.java_hillel.svidovyi.Task34_35_36;

public class Employee {
    private  String name;
    private double Salary;
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
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
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

    @Override
    public boolean equals(Object e) {
        Employee emp = (Employee) e;
        return this.getName() == emp.getName();
    }

    @Override
    public int hashCode() {
        int hashno = 7;
        hashno = 13 * hashno + (name == null ? 0 : name.hashCode());
        return hashno;
    }
}
