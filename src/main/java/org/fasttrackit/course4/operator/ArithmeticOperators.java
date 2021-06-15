package org.fasttrackit.course4.operator;

public class ArithmeticOperators {

    public static void main(String[] args) {
        // incremental
        int op1 = 2;
        int op2 = 3;
        int result1 = op1 + op2; // ==5
        result1++; //==6
        System.out.println("Result 1: " + (result1++)); // still ==6

        int op21 = 5;
        int op22 = 7;
        int result2 = op21 + op22; // ==12
        System.out.println("Result 2: " + (result2++)); // still ==12 (left-to-right: first prints the number, then increments)

        System.out.println("Result 3: " + result2); // ==13 (simply prints the number)

        System.out.println("Result 4: " + (++result2)); // ==14 (first increments, then prints the number)

        result2 += 5; // the same thing as: result2 = result2 + 5;
        System.out.println("Result 5: " + result2); // ==19
        // can be:
        // +=
        // -=
        // /=
        // *=
    }
}
