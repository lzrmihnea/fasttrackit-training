package org.fasttrackit.course9._03container;

/**
 * Conventions for generics:
 * E => Element
 * T => Type
 * K => Key
 * V => Value
 * E & T are synonyms.
 */
public class Container<T> {
    T containedValue;

    public Container(T givenValue) {
         this.containedValue = givenValue;
    }

    T getValue() {
        return this.containedValue;
    }

    void printValue() {
        System.out.println(this.containedValue.toString());
    }
}
