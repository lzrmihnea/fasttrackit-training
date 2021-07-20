package org.fasttrackit.course9._03container;

import org.fasttrackit.course9._00model.Human;
import org.fasttrackit.course9._00model.Mechanic;
import org.fasttrackit.course9._00model.Pilot;
import org.fasttrackit.course9._00model.Plumber;

import java.util.*;

public class Sorter {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("z");
        strings.add("k");
        strings.add("a");
        strings.add("g");

        List<String> sortedString = getSortedList(strings, String::compareTo);
        System.out.println(sortedString);

        Human h1 = new Mechanic();
        h1.setName("Zoe");
        Human h2 = new Plumber();
        h2.setName("Georgiana");
        Human h3 = new Pilot();
        h3.setName("Bogdan");
        List<Human> humanList = new ArrayList<>();
        humanList.add(h1);
        humanList.add(h2);
        humanList.add(h3);

        /**
         * both parameters of getSortedList must have <Human> as a type (List<Human> & Comparator<Human>)
         */
        List<Human> sortedByName = getSortedList(humanList, new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(sortedByName);
    }

    static <T> List<T> getSortedList(List<T> toSort, Comparator<T> comparator) {
        Collection<T> sorted = new TreeSet<>(comparator);
        sorted.addAll(toSort);
        return new ArrayList(sorted);
    }

    /**
     *  E from below has no connection to T from method above
     */
    static <E> void printSomething(E printMe) {

    }
}
