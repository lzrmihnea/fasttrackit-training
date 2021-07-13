package org.fasttrackit.course8.j8_functional_interf;

public class FunctionalInterfExample {

    public static void main(String[] args) {

        printCalculation(((first, second) -> first + second),
                12,
                13);


        printCalculation((something, somethingElse) -> something - somethingElse,
                101,
                202);


        printCalculation((unu, altu) -> unu * altu,
                22,
                103);


        printCalculation((un, doi) -> {
            System.out.println("printez pe primu: " + un);
            System.out.println("returnez pe al doilea: " + doi);
            return doi;
        },
                44,
                56);

        Interf3 behaviorToPass = new Interf3() {
            @Override
            public double calculateSomething(int op1, int op2) {
                return op1 / op2;
            }
        }; // just like above, but in a more difficult syntax
        printCalculation(behaviorToPass, 88, 99);

        Interf3 behaviorToPass2 = (one, two) -> one % two;
        printCalculation(behaviorToPass2, 100, 200);
    }

    static void printCalculation(Interf3 interf3,
                                 int firstOperator,
                                 int secondOperator) {
        System.out.println(interf3);
        System.out.println(
                interf3.calculateSomething(firstOperator, secondOperator));
    }
}
