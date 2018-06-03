package com.java_hillel.svidovyi.Task39;

import java.util.Scanner;

public class Task3 extends Thread{
    private String name;

    public String getNameString() {
        return name;
    }

    @Override
    public void run() {
        System.out.println("Type your name, please.");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
    }
}
