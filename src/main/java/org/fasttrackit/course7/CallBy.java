package org.fasttrackit.course7;

import org.fasttrackit.course7.model.Phone;

public class CallBy {
    public static void main(String[] args) {
        System.out.println(" \n Call-by-value example");
        int randomInt = 8;
        System.out.println("1. Outer before: " + randomInt); // 1: 8
        changeAndPrint(randomInt);
        System.out.println("4. Outer after: " + randomInt); // 4: 8

        System.out.println(" \n Call-by-reference example");
        Phone ph1 = new Phone("OnePlus", "6");
        System.out.println("2.1. Outer before: " + ph1); // 2.1. OnePlus, 6
        changeAndPrint(ph1);
        System.out.println("2.4. Outer after: " + ph1); // 2.4. Orange, K1
    }

    public static void changeAndPrint(int someInt) { // call-by-value, because it's a primitive
        System.out.println("2. Inner before: " + someInt); // 2: 8
        someInt++;
        System.out.println("3. Inner after: " + someInt); // 3: 9
    }

    public static void changeAndPrint(Phone somePhone) {
        System.out.println("2.2. Inner before: " + somePhone); // 2.2. OnePlus, 6
        somePhone.setBrand("Orange");
        somePhone.setModel("K1");
        System.out.println("2.3. Inner after: " + somePhone); // 2.3. Orange, K1
    }
}
