package org.fasttrackit.course6.boxing;

public class BoxingRunner {
    public static void main(String[] args) {
        Boolean boxed = Boolean.TRUE;
        printMe(boxed);

        //Boolean shouldBeBoxed = null; // ! dangerous to unbox a null value
        //printMe(shouldBeBoxed);

        int intValue = 1;
        Integer boxedInt = intValue;
        printMe(boxedInt);
    }

    static void printMe(boolean toPrint) { // overloaded method
        System.out.println(toPrint);
    }
    static void printMe(int intToPrint) { // overloaded method
        System.out.println(intToPrint);
    }
}
