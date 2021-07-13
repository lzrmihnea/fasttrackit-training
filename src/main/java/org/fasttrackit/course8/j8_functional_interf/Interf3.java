package org.fasttrackit.course8.j8_functional_interf;

@FunctionalInterface // means we will have exactly 1 single abstract method
public interface Interf3 {

    //single abstract method
    double calculateSomething(int op1,
                              int op2);

    default String giveMeSomething() {
        return "asd";
    }

    default int getSum(int op1, int op2) {
        return op1 + op2;
    }
}
