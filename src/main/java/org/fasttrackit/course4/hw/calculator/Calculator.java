package org.fasttrackit.course4.hw.calculator;

public class Calculator {
// 2.1. Create a calculator class with 4 basic operations:
//  Add, Subtract, Multiply, Divide
//    +, -, /, *
// 2.2. The calculator receives 3 parameters:
//    Operator 1, Operator 2, Operation type
// 2.3. The input is given from a psvm method.

    // A mathematic operation has the following:
    // terms (input data), operation sign (action), result (output)

    static double doOperation(int operator1, int operator2, String operationType) {
        switch (operationType) {
            case "+":
                return operator1 + operator2;
            case "-":
                return operator1 - operator2;
            case "*":
                return operator1 * operator2;
            case "/":
                return operator1 / operator2;
            default:
                return 0.0d;
        }
    }

    public static void main(String[] args) {
        double result= doOperation(55, 5, "/");
        System.out.println(result);
    }

}

