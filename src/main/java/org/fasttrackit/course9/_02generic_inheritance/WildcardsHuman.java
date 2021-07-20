package org.fasttrackit.course9._02generic_inheritance;

import org.fasttrackit.course9._00model.Human;
import org.fasttrackit.course9._00model.Mechanic;
import org.fasttrackit.course9._00model.Pilot;

import java.util.ArrayList;
import java.util.List;

public class WildcardsHuman {
    public static void main(String[] args) {
        List<Human> humanList = new ArrayList<>();
        humanList.add(new Mechanic());

        List<Mechanic> mechanics = new ArrayList<>();
        mechanics.add(new Mechanic());

        List<Pilot> pilots = new ArrayList<>();
        pilots.add(new Pilot());

        printMeWildcard(humanList);
        printMeWildcard(mechanics);
        printMeWildcard(pilots);

        List<Object> anything = new ArrayList<>();
        anything.add(new Pilot());
        anything.add(new Object());
        anything.add(new Mechanic());

        printMeSuper(humanList);
        printMeSuper(anything);
//        printMeSuper(mechanics); // won't work, it's a subclass of Human, NOT a superclass
//        printMeSuper(pilots); // won't work, it's a subclass of Human, NOT a superclass

        printMeAnything(humanList);
        printMeAnything(anything);
        printMeAnything(mechanics);
        printMeAnything(pilots);
    }

    /** Takes objects which are of type subclass of Human.
     * Cannot be modified. */
    static void printMeWildcard(List<? extends Human> humanList) {
//        humanList.add(new Pilot()); // we CANNOT modify the given list
        humanList.forEach(System.out::println); // lambda short reference
    }

    /** Takes objects which are a superclass of Human (Object)
     * Can be modified. */
    static void printMeSuper(List<? super Human> humanList) {
        humanList.add(new Pilot()); // we can modify the given list
        humanList.forEach(System.out::println); // lambda short reference
    }

    /** Takes any type of Objects.
     * Cannot be modified.
     * No type information. Might as well just use List. */
    static void printMeAnything(List<?> anything) {
//        anything.add(new Mechanic()); // we CANNOT modify the given list
        final Object o = anything.get(0); // we have no type information. Not very useful.
        anything.forEach(System.out::println);
    }
}
