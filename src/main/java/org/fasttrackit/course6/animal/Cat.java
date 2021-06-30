package org.fasttrackit.course6.animal;

public class Cat extends Animal {
    @Override
    String talk() { return super.talk() + "meow"; }
}
