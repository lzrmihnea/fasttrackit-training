package org.fasttrackit.course5._2_init;

public class Cat {
    static int totalNumberOfCats = 0; //A
    static { System.out.print(" A "); }

    String name = null; //B
    { System.out.print(" B "); }

    public Cat() { //C
        System.out.print(" C ");
    }

    public Cat(String givenName) { //D
        this.name = givenName;
        System.out.print(" D ");
    }

}
