package com.java_hillel.svidovyi.Task34_35_36;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testAverageSalary() {
        Employee emp1 = new Employee("Anna", 28, Gender.FEMALE);
        Employee emp2 = new Employee("Igor", 35, Gender.MALE);
        Employee emp3 = new Employee("Ivan", 54, Gender.MALE);
        emp1.setSalary(10.00);
        emp2.setSalary(20.00);
        emp3.setSalary(30.00);

        Stream<Employee> empStream = Stream.<Employee>of(emp1, emp2, emp3);
        Assert.assertEquals(Double.valueOf(20.00), Main.averageSalary(empStream));
    }
}