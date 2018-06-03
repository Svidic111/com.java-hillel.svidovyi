package com.java_hillel.svidovyi.Task39;

public class Task2 implements Runnable {
    @Override
    public void run() {
//        System.out.printf("%d %d %d %d %d start:\n", 1, 2, 3, 4, 5);
        for (int i = 1; i < 6; i++) {
            System.out.print(i + " ");
        }
        System.out.println("start:");
    }
}
