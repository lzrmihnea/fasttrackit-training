package org.fasttrackit.course5._3_class_types;

// a concrete class can extend 1 single other class
// a concrete class can implement multiple interfaces
public class Bat extends FlyingMammal implements Living, Carnivore {

    @Override
    public void createsNest() {

    }

    @Override
    public void eats() {

    }

    @Override
    public String talks() {
        return null;
    }
}
