package com.java_hillel.svidovyi.Task34_35_36;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    // Task 35
    public static List<Employee> streamToList(Stream<Employee> E) {
        List<Employee> result = new LinkedList<>();
        E.forEach(e -> result.add(e));
        return result;
    }

    // Task 36
    public static Double averageSalary(Stream<Employee> E) {
        Double result = E.mapToDouble(e -> e.getSalary()).average().getAsDouble();
        return result;
    }

    public static void main(String[] args) {

    Employee emp1 = new Employee("Anna", 28, Gender.FEMALE);
    Employee emp2 = new Employee("Igor", 35, Gender.MALE);
    Employee emp3 = new Employee("Ivan", 54, Gender.MALE);
    Employee emp4 = new Employee("Marina", 36, Gender.FEMALE);
    Employee emp5 = new Employee("Robert", 32, Gender.MALE);
    Employee emp6 = new Employee("Olga", 18, Gender.FEMALE);
    Employee emp7 = new Employee("Vladimir", 46, Gender.MALE);
    Employee emp8 = new Employee("Anna", 30, Gender.FEMALE);

    emp1.setMarried(false);
    emp1.setSalary(10.50);
    emp2.setMarried(false);
    emp2.setSalary(9.30);
    emp3.setMarried(false);
    emp3.setSalary(15.30);
    emp4.setMarried(true);
    emp4.setSalary(11.30);
    emp5.setMarried(true);
    emp5.setSalary(12.00);
    emp6.setMarried(false);
    emp6.setSalary(7.25);
    emp7.setMarried(true);
    emp7.setSalary(18.70);
    emp8.setMarried(true);
    emp8.setSalary(10.00);


        Stream<Employee> empStream = Stream.<Employee>of(emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8);

        //Task35 - получение листа из стрима
        //System.out.println(streamToList(empStream));

        //Task36 - получение средний зарплаты
        System.out.println(averageSalary(empStream));

        // List<Employee> employeeList = Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8);
    // получить первого женатого мужчину + вывести его имя в консоль;
//    System.out.println(employeeList.stream().filter(e -> e.isMarried() && e.getGender() == Gender.MALE).findFirst());

    // получить любую незамужнюю женщину + вывести её имя в консоль
//    System.out.println(employeeList.stream().filter(e -> !e.isMarried() && e.getGender() == Gender.FEMALE).findAny());

    // >45 лет и только мужчин + вывести их имена в консоль;
//    employeeList.stream().filter(e -> e.getAge() > 45 && e.getGender() == Gender.MALE).forEach(System.out::println);

    // <30 лет и только женщин + вывести их имена в консоль;
//    employeeList.stream().filter(e -> e.getAge() < 30 && e.getGender() == Gender.FEMALE).forEach(System.out::println);

    // между 33 и 37 годами как мужчин так и женщин + вывести их имена в консоль;
//    employeeList.stream().filter(e -> e.getAge() > 33 && e.getAge() < 37).forEach(System.out::println);

    // точное количество незамужних женщин + вывести это кол-во в консоль;
//    System.out.println(employeeList.stream().filter(e -> !e.isMarried() && e.getGender() == Gender.FEMALE).toArray().length);

    // получить только зарплаты мужчин старше 30 лет + вывести каждую ЗП в консоль;
//    employeeList.stream().filter(e -> e.getAge() > 30 && e.getGender() == Gender.MALE).forEach(e -> System.out.println(e.getSalary()));

    // получить сотрудников только с уникальными именами + вывести в консоль их имена.
//    employeeList.stream().distinct().forEach(System.out::println);
       // employeeList.stream().map(e -> e.getName()).distinct().forEach(System.out::println);
    }
}
