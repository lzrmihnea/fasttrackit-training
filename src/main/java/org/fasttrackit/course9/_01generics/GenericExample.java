package org.fasttrackit.course9._01generics;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {

    public static void main(String[] args) {
        List everythingInside = new ArrayList();
        everythingInside.add("asd");
        everythingInside.add(1L); //autoboxing: long => Long
        everythingInside.add(new Object());
        everythingInside.add(true);

        System.out.println(everythingInside);

        String o = (String) everythingInside.get(0);
        System.out.println(o);

        List<String> onlyStrings = new ArrayList<>();
        onlyStrings.add("1L");
        onlyStrings.add("asd");
//        onlyStrings.add(1L); // won't be permitted at compile-type, due to enforced type safety
        final String firstString = onlyStrings.get(0);
        System.out.println(firstString);

    }
}
