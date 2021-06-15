package org.fasttrackit.course4.statement;

public class WhileAndDoWhileStatement {

    public static void main(String[] args) {
        whileLoop("k", -1); // will print 10 times
        whileLoop("b", 1000); // will not print
        doWhileLoop("var1", 0); // will print 11 times
        doWhileLoop("varTooBig", 101); // will print once
    }

    private static void whileLoop(String varName, int number) {
        int k = number > 0 ? number : 0;
        while (k < 10) {
            System.out.println(varName + " = " + k);
            k++;
        }
    }

    private static void doWhileLoop(String varName, int x) {
        do {
            System.out.println(varName + " = " + x);
            x++;
        } while (x <= 10);
    }
}
