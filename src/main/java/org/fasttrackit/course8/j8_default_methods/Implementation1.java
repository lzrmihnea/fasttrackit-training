package org.fasttrackit.course8.j8_default_methods;

public class Implementation1 implements Interf1, Interf2 {

    public static void main(String[] args) {
        Implementation1 obj1 = new Implementation1();
        obj1.printMe("someText");
    }

    @Override
    public void printMe(String someString) {
        Interf2.super.printMe(someString);
    }
}
