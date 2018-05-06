package com.java_hillel.svidovyi.Task33;

public class StringWorker {
    public static<T> T act(DoOnlyAction action, String s) {
        return (T) action.todo(s);
    }

}
