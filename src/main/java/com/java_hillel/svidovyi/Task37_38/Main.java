package com.java_hillel.svidovyi.Task37_38;

import java.util.List;

import static com.java_hillel.svidovyi.Task37_38.EmployeeReader_Writer.extractEmployers;

public class Main {
    public static void main(String[] args) {
        List<Employee> emList1 = extractEmployers("C:\\Users\\Svidic\\IdeaProjects\\Home_Work\\src\\main\\resources\\input.csv");
        emList1.stream().forEach(e -> {
            if (e.getAge() > 25 & e.getAge() <30) {
                long s = e.getSalary();
                e.setSalary(s = s + 25000);
            }
            if (e.getAge() >= 30) {
                long s = e.getSalary();
                e.setSalary(s = s + 30000);
            }
        });

        EmployeeReader_Writer.writeEployeesToCSV(emList1, "C:\\Users\\Svidic\\IdeaProjects\\Home_Work\\res\\output.csv");

    }
}
