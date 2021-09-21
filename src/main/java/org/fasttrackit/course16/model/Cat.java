package org.fasttrackit.course16.model;

public class Cat implements Animal {
    private String name;
    public Cat(String name) { this. name = name;}
    @Override
    public void talks() {
        System.out.println("meow");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
