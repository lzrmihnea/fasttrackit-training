package org.fasttrackit.course16.model;

public class Dog implements Animal {
    private String name;
    public Dog(String name) { this. name = name;}
    @Override
    public void talks() {
        System.out.println("whoof");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
