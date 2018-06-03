package com.java_hillel.svidovyi.Task39;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();
        Task3 t3 = new Task3();

        Runnable task4 = () -> {
            System.out.printf("My name is %s.", t3.getNameString());
        };
        Thread t4 = new Thread(task4);

        t1.run();
        t2.run();
        t3.run();
        t3.join();
        t4.run();

    }
}
