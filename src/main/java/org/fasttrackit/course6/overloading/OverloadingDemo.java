package org.fasttrackit.course6.overloading;

public class OverloadingDemo {

    public static void main(String[] args) {
        printMe(1);

//        printMe(2l);
//        printMe(new Long(2));
//        printMe(new Integer(2));
//        printMe(1, 2, 3, 4);
    }

    // Methods below added in order of preference of Java when calling printMe(1); (except the one with Long, which isn't called)
    static void printMe(int toPrint) { System.out.println("int " + toPrint); }
    static void printMe(long toPrint) { System.out.println("long " + toPrint); }
    static void printMe(Integer toPrint) { System.out.println("Integer " + toPrint); }
    static void printMe(Number toPrint) { System.out.println("Number " + toPrint); } // Number is a Superclass of Integer
    static void printMe(Object toPrint) { System.out.println("Object " + toPrint); } // Object is a Superclass of everything
    static void printMe(int... toPrint) { System.out.println("int..." + toPrint); } // var-args, can have any number of ints
    static void printMe(Long toPrint) { System.out.println("Long " + toPrint); } // won't work for int, can't widen AND autobox
}