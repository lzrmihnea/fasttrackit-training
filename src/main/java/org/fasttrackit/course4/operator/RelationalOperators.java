package org.fasttrackit.course4.operator;

public class RelationalOperators {
    public static void main(String[] args) {
        int op11 = 2;
        int op12 = 3;
        boolean result1 = op11 < op12;
        System.out.println("Result of comparison: " + result1);

        // In Java, we have a String pool
        // When we declare a basic String (ex: "abc"),
        // it is composed and taken from the pool
        String s1 = "abc";
        String s2 = "abc"; // This one is searched for in the String pool. (same memory zone, because Java defaults it)
        boolean result2 = s1 == s2;
        System.out.println("Result 2: " + result2); // true

        String s31 = "abc"; // This one is also searched for in the String pool. (same memory zone, because Java defaults it)
        String s32 = new String("abc"); //Here we explicitly create a new Object
        boolean result31 = s31 == s32; // comparison by equals ( == ) looks at the Object references
        System.out.println("Result 3: " + result31); // false
        boolean result32 = s31.equals(s32); // calling .equals() will compare the object BY THEIR INNER VALUES
        System.out.println("Result 4: " + result32); // true

        int op41 = 21;
        int op42 = 22;
        boolean result41 = op41 != op42;
        System.out.println("Result 5: " + result41); // true

        String s61 = "abc";
        String s62 = "abc";
//        boolean result6 = s61 > s62; // cannot apply to String

        char c71 = 'b';
        char c72 = 'a';
        boolean result7 = c71 > c72; // This will decompose the chars into numbers and compare their number value
        //boolean result7 = ((int) c71) > (int) c72); <= this happens in the background
        System.out.println("Result 7: " + result7);
        System.out.println("c71: " + (int) c71);
        System.out.println("c72: " + (int) c72);
        System.out.println("other: " + (int) '0');
        System.out.println("a: " + (int) 'a');
        System.out.println("A: " + (int) 'A');


    }
}
