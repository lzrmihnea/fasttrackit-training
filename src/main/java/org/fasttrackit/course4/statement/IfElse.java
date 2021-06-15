package org.fasttrackit.course4.statement;

public class IfElse {
    public static void main(String[] args) {
        System.out.println("\n 1. If with no {}");
        int op11 = 0;
        int op12 = 0;

        if (op11 + op12 >= 3) // only evaluates next line
            System.out.println("Result 1: " + (op11 + op12)); // will not be printed
        op11++;
        op12++;
        System.out.printf("op11=" + op11 + ", op12=" + op12 + "\n"); // will be printed


        System.out.println("\n 2. If with {}");
        int op21 = 4;
        int op22 = 5;
        int result2 = op21 * op22;
        if (result2 >= 14) { // Because we have {}, the whole block {} will be evaluated
            System.out.println("Result 2: " + result2);
            op21++;
            op22++;
            System.out.printf("op21=" + op21 + ", op22=" + op22 + "\n");
        }

        System.out.println("\n 3. If-else ( with {} )");
        String s31 = "abc";
        String s32 = "abc";
        if (s31 == s32) {
            System.out.println("Sunt egale, sarbatoare!"); // merge aici
        } else {
            System.out.println("Nu-s egale, of, viata mea!");
        }

        System.out.println("\n 4. If-else ( with {} )");
        String s41 = "abc";
        String s42 = new String("abc"); // new object, different from line 37, even though with the same value
        if (s41 == s42) { // == compares objects
            System.out.println("Acuma chiar sunt egale, sarbatoare!");
        } else {
            System.out.println("Vai, nici acum!!"); // merge aici
        }

        System.out.println("\n 5. If-else-if ( with {} )");
        String s51 = "xyz"; // Object created by Java from String pool
        String s52 = new String("xyz"); // New object reference (new String) manually created by us
        if (s51 == s52) { // == is comparing by object reference
            System.out.println("==");
        } else if (s51.equals(s52)) { // .equals() compares the inner values
            System.out.println(".equals()"); // merge aici
        } else {
            System.out.println("false");
        }
    }
}
