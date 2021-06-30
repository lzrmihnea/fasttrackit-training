package org.fasttrackit.course5._3_class_types;

public class AnimalRunner {

    public static void main(String[] args) {
//        Horse bojack = new Horse();
//        System.out.println(bojack.talks());
//        bojack.runs();
//
//
//        // inline class declaration
//        Living someBeing = new Living() {
//            @Override
//            public void eats() {
//                System.out.println("alien food");
//            }
//
//            @Override
//            public String talks() {
//                return "brrrr";
//            }
//        };



        Living strangeAnimal = new Horse();
        strangeAnimal.eats();
        System.out.println(strangeAnimal.talks());
        //strangeAnimal.runs();
        // all methods at compile time are resolved
        // depending on the Class declared Type (left of = )
    }

}
