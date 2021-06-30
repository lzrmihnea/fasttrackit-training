package org.fasttrackit.course6.animal;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal rex = getRandomAnimal();

        System.out.println(rex.talk()); // meow
        if(rex instanceof Dog) {
            Dog rexCastAsDog = (Dog) rex; // Cast
            System.out.println(rexCastAsDog.attack());
        }
    }









    static Animal getRandomAnimal() {
        return new Cat();
    }

}

