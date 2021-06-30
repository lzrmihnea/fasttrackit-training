package org.fasttrackit.course5._3_class_types.abstr;

public class ClassRunner {
    public static void main(String[] args) {
        AbstrClass obj1 = new ConcreteClass();

        obj1.talks();
        obj1.listens();

        AbstrClass obj2 = new AnotherConcreteClass();
        obj2.talks();
        obj2.listens();
    }
}
