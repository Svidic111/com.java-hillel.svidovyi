package com.java_hillel.svidovyi.Task31;

import java.util.LinkedList;

public class SortStudent {

    public static LinkedList<Student> sortByName(LinkedList<Student> list, String param) {
        LinkedList<Student> resultList = new LinkedList<Student>();
        for (Student std: list) {
            if (nameStarts(std, param)) {
                resultList.add(std);
            }
        }
        return resultList;
    }

    public static LinkedList<Student> sortByID(LinkedList<Student> list, int maxID) {
        LinkedList<Student> resultList = new LinkedList<Student>();
        for (Student std: list) {
            if (idSort(std, maxID)) {
                resultList.add(std);
            }
        }
        return resultList;
    }

    public static LinkedList<Student> sortByAge(LinkedList<Student> list, int maxAge) {
        LinkedList<Student> resultList = new LinkedList<Student>();
        for (Student std: list) {
            if (ageSort(std, maxAge)) {
                resultList.add(std);
            }
        }
        return resultList;
    }


    private static boolean nameStarts(Student student, String str) {
        FilterStudent filtName = (stud) -> stud.getName().startsWith(str);
        return filtName.check(student);
    }

    private static boolean idSort(Student student, int maxID) {
        FilterStudent filtName = (stud) -> stud.getId() < maxID;
        return filtName.check(student);
    }

    private static boolean ageSort(Student student, int maxAge) {
        FilterStudent filtName = (stud) -> stud.getAge() < maxAge;
        return filtName.check(student);
    }

}
