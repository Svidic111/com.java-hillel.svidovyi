package com.java_hillel.svidovyi.Task37_38;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class EmployeeReader_Writer {
    public static List<Employee> extractEmployers(String fileName) {
        List<String> lineList = null;

        try {
            lineList = Files.readAllLines(Paths.get(fileName));
        } catch (IOException e) {
            e.printStackTrace();
            lineList = Collections.emptyList();
        }
        List<Employee> resultList = new LinkedList<>();
        lineList.stream().forEach(e -> {
            String[] fieldes = e.split(", ");
            for (int i = 0; i < fieldes.length; i++) {
                fieldes[i] = fieldes[i].replaceAll("\"", "");
            }

            String name = fieldes[0];
            Integer age = Integer.valueOf(fieldes[2]);
            Gender g;
            if (fieldes[3].length() == 4) {
                g = Gender.MALE;
            } else g = Gender.FEMALE;
            Employee emp = new Employee(name, age, g);
            emp.setSalary(Long.valueOf(fieldes[1]) * 100);
            boolean married = false;
            if (fieldes[4].length() == 3) married = true;
            emp.setMarried(married);

            resultList.add(emp);
        });
        return resultList;
    }

    public static void writeEployeesToCSV(List<Employee> emList, String fileName) {
        StringBuilder content = new StringBuilder();
        emList.stream().forEach(e -> {
            String line = e.toCSVLine();
            content.append(line).append("\n");
        });

        try (FileWriter writer = new FileWriter(fileName);)
        {
            writer.append(content);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(extractEmployers("C:\\Users\\Svidic\\IdeaProjects\\Home_Work\\src\\main\\resources\\input.csv"));
    }
}
