package org.fasttrackit.course5._3_class_types.abstr;

public class ConcreteClass extends AbstrClass {

    @Override
    public void talks() {
        System.out.println("talks in concrete");
    }

    @Override
    public void listens() {
        System.out.println("listens in concrete");
    }
}
