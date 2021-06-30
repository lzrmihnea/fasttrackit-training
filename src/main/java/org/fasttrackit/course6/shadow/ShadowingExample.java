package org.fasttrackit.course6.shadow;

public class ShadowingExample {
    private String name = "shadowed";

    public ShadowingExample(String name) {
        System.out.println(name); // This is Shadowing. Will it print "shadowed" or "new name" ?
    }

    public static void main(String[] args) {
        new ShadowingExample("new name");
    }
}
