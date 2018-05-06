package com.java_hillel.svidovyi.Task33;

public class StringAlg {
    public static int getNumberParts(String s) {
        String[] res = s.split(",");
        return res.length;
    }
}
