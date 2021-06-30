package org.fasttrackit.course5._1_static_vs_instance;

public class Dog {
    static int totalNumberOfDogs; // shared between all objects
    String name;
    int numberOfLegs;

    public static int getTotalNumberOfDogs() {
        return totalNumberOfDogs;
    }

    public static void setTotalNumberOfDogs(int totalNoOfDogs) {
        Dog.totalNumberOfDogs = totalNoOfDogs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }
}
