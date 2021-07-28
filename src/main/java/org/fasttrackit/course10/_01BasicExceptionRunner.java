package org.fasttrackit.course10;

import java.util.ArrayList;
import java.util.List;

public class _01BasicExceptionRunner {

    public static void main(String[] args) {

        try {
            doSomething("asd124356");
        }  catch (Exception someException) {
            System.err.println(someException);
        }
    }

    private static void doSomething(String unText) throws Exception {
        if (unText == null) {
            throw new Exception("text null");
        }
        if (unText == "asd") {
            throw new IllegalArgumentException("text prea simplu");
        }
        System.out.println("S-a intamplat ceva");
        throw new IllegalStateException("e bai");
    }
}
