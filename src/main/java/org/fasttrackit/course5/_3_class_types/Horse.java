package org.fasttrackit.course5._3_class_types;

public class Horse implements Living {
    @Override
    public void eats() {
        System.out.println("The horse eats");
    }

    @Override
    public String talks() {
        return "nyaaaaa";
    }

    public void runs() {
        System.out.println("galop galop");
    }
}
