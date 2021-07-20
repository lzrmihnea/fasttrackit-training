package org.fasttrackit.course9._02generic_inheritance;

import java.util.ArrayList;
import java.util.List;

public class WildcardsExample {
    public static void main(String[] args) {
        List<Number> numberList = new ArrayList<>();
        numberList.add(2); // integer
        numberList.add(3.0f); // float
        printMeWildcard(numberList); // works, <? extends Number> with <Number>
        printMe(numberList); // works, same erasure <Number> & <Number>

        List<Integer> integerList = new ArrayList<>();
        integerList.add(27);
        integerList.add(41);
        printMeWildcard(integerList); // works, <? extends Number> with <Integer>
//        printMe(integerList); // doesn't work, diff erasure <Number> & <Integer>

        ArrayList<Float> floatArrayList = new ArrayList<>();
        floatArrayList.add(5.0f);
        floatArrayList.add(123f);
        printMeWildcard(floatArrayList); // works, <? extends Number> with <Float>
//        printMe(floatArrayList); // doesn't work, diff erasure <Number> & <Float>
    }

    /**
     * In this method, we are allowed to pass a List of something
     * that extends Number. For example, we can pass the following:
     * List<Number>
     * List<Integer>
     * List<Double>
     * ArrayList<Long>
     * ArrayList<Float>
     *
     * @param numbersList
     */
    static void printMeWildcard(List<? extends Number> numbersList) {
        numbersList.forEach(number -> System.out.println(number));
    }

    static void printMe(List<Number> numberList) {
        numberList.forEach(number -> System.out.println(number));
    }
}
