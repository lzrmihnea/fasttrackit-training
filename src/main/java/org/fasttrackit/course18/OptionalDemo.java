package org.fasttrackit.course18;

import org.fasttrackit.course16.model.Animal;
import org.fasttrackit.course16.model.Cat;
import org.fasttrackit.course16.model.Dog;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        final Optional<Animal> maybeDog = Optional.ofNullable(new Dog("Killer"));
        final Optional<Animal> notADog = Optional.ofNullable(null);

        // ... we do some logic ...
        printAnimal(notADog);
    }

    private static void printAnimal(Optional<Animal> toPrint) {
//        if(toPrint.get() != null) {
        if(toPrint.isEmpty()) {
            System.out.println("No dog was sent");
        } else {
            System.out.println(toPrint.get());
        }
    }
}
