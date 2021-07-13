package org.fasttrackit.course8.j8_default_methods;

public interface Interf2 {

    default void printMe(String obj) {
        System.out.println("Interf2: " + obj);
    }
}
