package org.fasttrackit.course5._3_class_types;

public abstract class FlyingMammal {

    // can have
    public void flies() {
        System.out.println("flaps wings");
    }

    // for abstract methods, we do not have a body
    // because we do not have a body, we cannot call the method.
    // can have
    public abstract void createsNest();
}
