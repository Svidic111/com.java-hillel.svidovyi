package com.java_hillel.svidovyi.Task33;

@FunctionalInterface
public interface DoOnlyAction<T> {
    T todo(String s);
}
