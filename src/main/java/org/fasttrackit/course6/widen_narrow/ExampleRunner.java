package org.fasttrackit.course6.widen_narrow;

public class ExampleRunner {
    public static void main(String[] args) {
        byte byteSample = 126;
        System.out.println(byteSample);

        int intSample = byteSample; // int intSample = (int) byteSample;
        System.out.println(intSample);

        int intSample2 = 200; // more than Byte.MAX_VALUE
        byte byteSample2 = (byte) intSample2; // needs explicit cast for narrowing
        System.out.println(byteSample2);
        // if a value is > Byte.MAX_VALUE, when it goes over, it starts again from Byte.MIN_VALUE

        byte byteSample3 = Byte.MAX_VALUE;
        System.out.println("initial: " + byteSample3++);
        System.out.println("incr by 1: " + byteSample3++); // Will jump to Byte.MIN_VALUE
        System.out.println("incr by 2: " + byteSample3++);
        System.out.println("incr by 3: " + byteSample3);

        System.out.println(Integer.MAX_VALUE+1);
    }
}
