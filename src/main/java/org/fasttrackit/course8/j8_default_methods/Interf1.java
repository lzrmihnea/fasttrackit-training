package org.fasttrackit.course8.j8_default_methods;

public interface Interf1 {

    default void printMe(String someString) {
        System.out.println("Interf1: " + someString);
    }
}
