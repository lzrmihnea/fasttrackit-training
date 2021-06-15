package org.fasttrackit.course4.statement;

public class ForStatement {
    public static void main(String[] args) {

        System.out.println("\n while");
        // same thing as for below
        int k = 0;
        while (k < 10) {
            System.out.print("| k = " + k);
            k++;
        }

        System.out.println("\n do-while");
        // same thing as for below
        int t = 0;
        do {
            System.out.print("| t = " + t);
            t++;
        } while (t < 10);

        System.out.println("\n for");
        for (int i = 0; i < 10; i++) {
            System.out.print(" | i = " + i);
        }


        System.out.println("\n for explicit \n");
        for (int i = 0; i < 3; System.out.println("Step 2: Increment i = " + i++)) {
            System.out.println(" Step 1. Run code block: i = " + i);
        }
    }
}
