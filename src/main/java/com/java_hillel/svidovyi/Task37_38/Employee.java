package com.java_hillel.svidovyi.Task37_38;

import com.java_hillel.svidovyi.Task33.StringAlg;

public class Employee {
    private String name;
    private long salary; // it holds in copeecs(cents).
    private int age;
    private Gender gender;
    private boolean married;

    public String toCSVLine() {
        String mariege = "";
        if (this.married) mariege = "yes";
        else mariege = "no";
        StringBuilder sb = new StringBuilder().append("\"" + this.name + "\"").append(", ")
                .append(this.salary/100).append(", ")
                .append(this.age).append(", ")
                .append("\"" + this.gender.toString().toLowerCase() + "\"").append(", ")
                .append("\"" + mariege + "\"");
        return sb.toString();
    }

    public Employee(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
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
