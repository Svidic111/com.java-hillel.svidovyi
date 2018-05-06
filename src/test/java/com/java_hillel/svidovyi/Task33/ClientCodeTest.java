package com.java_hillel.svidovyi.Task33;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClientCodeTest {

    @Test
    public void TestNumSentenceParts() {
        String strTest = "1, 2, 3, 4, 5.";
        assertEquals(5, ClientCode.numSentenceParts(strTest));
    }
}