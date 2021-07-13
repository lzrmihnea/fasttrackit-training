package org.fasttrackit.course8;

import java.util.ArrayList;
import java.util.List;

public class EnhancedForExample {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Mere");
        stringList.add("Pere");
        stringList.add("Nuci");
        stringList.add("Cozonaci");


        for (int i = 0; i < stringList.size(); i++) {
            String singleElement = stringList.get(i);
            System.out.println(singleElement);
        }

        /**
         * We can use the following syntax (enhanced for) because
         * List implements Collection & Collection extends Iterable
         */
        for(String singleElement : stringList) {
            System.out.println(singleElement);
        }
    }
}
