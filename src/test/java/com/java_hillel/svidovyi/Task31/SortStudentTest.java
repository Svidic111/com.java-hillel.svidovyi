package com.java_hillel.svidovyi.Task31;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class SortStudentTest {
    private static LinkedList<Student> studentBaseList = new LinkedList<Student>();
    @BeforeClass
    public static void initList() {
        Student st1 = new Student(1, "Bob", 21);
        Student st2 = new Student(2, "Adam", 18);
        Student st3 = new Student(3, "Andrew", 20);
        Student st4 = new Student(4, "Steve", 19);
        Student st5 = new Student(5, "Jeff", 21);
        Student st6 = new Student(6, "Rick", 56);
        Student st7 = new Student(7, "Morty", 14);
        studentBaseList.add(st1);
        studentBaseList.add(st2);
        studentBaseList.add(st3);
        studentBaseList.add(st4);
        studentBaseList.add(st5);
        studentBaseList.add(st6);
        studentBaseList.add(st7);
    }

    @Test
    public void TestSortByName()  throws Exception {
        LinkedList<Student> resList = SortStudent.sortByName(studentBaseList, "A");
        System.out.println(resList);
        assertEquals(2, resList.size());
    }

    @Test
    public void TestSortByID()  throws Exception {
        LinkedList<Student> resList = SortStudent.sortByID(studentBaseList, 5);
        System.out.println(resList);
        assertEquals(4, resList.size());
    }

    @Test
    public void TestSortByAge()  throws Exception {
        LinkedList<Student> resList = SortStudent.sortByAge(studentBaseList, 19);
        System.out.println(resList);
        assertEquals(2, resList.size());
    }
}