package com.java_hillel.svidovyi.Task33;

public class ClientCode {

    public static int numSentenceParts(String str) {
        return StringWorker.act(StringAlg::getNumberParts, str);
    }
}
