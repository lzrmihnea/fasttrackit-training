package org.fasttrackit.course9._02generic_inheritance;

import java.util.ArrayList;
import java.util.List;

public class InheritanceExample {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(10);
        integerList.add(43);
        integerList.add(23);
        integerList.add(73);

//         won't work, unless `integerList` is either List<Number> or ArrayList<Number>
//        printMe(integerList);

        Number number1 = new Integer(12); // will work, thought Deprecated
//        List<Number> list01 = new ArrayList<Integer>(); // won't work
        Object obj1 = new ArrayList<Number>(); // will work
        Object obj2 = new ArrayList<Integer>(); // will work

    }

    static void printMe(List<Number> numberList) {
        numberList.forEach(singleNumber -> System.out.println(singleNumber));
    }

    static List<Number> generateNumbers() {
        List<Number> integerList = new ArrayList<>();
        integerList.add(788);
        integerList.add(84);
        integerList.add(57);
        integerList.get(0);
        return integerList;
    }

}



