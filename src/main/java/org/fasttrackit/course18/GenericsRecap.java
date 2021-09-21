package org.fasttrackit.course18;

import org.fasttrackit.course16.model.Animal;
import org.fasttrackit.course16.model.Cat;
import org.fasttrackit.course16.model.Dog;

import java.util.ArrayList;
import java.util.List;

public class GenericsRecap {
    public static void main(String[] args) {

        List<Animal> animalList = new ArrayList();

        animalList.add(new Cat("Tom"));
        animalList.add(new Dog("Rex"));
        animalList.add(new Cat("Mitzi"));

        System.out.println(animalList);

        for (Animal element : animalList) {
            element.talks();
            System.out.println(element.getName());
        }

    }
}
