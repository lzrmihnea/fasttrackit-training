package org.fasttrackit.course4.statement;

public class BreakOrContinueStatement {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) { // daca e numar par, nu mai printeaza linia 11
                System.out.println("numar par, nu mai printam i");
                continue;
            }
            System.out.println(" i = " + i);
        }

        for (int k = 0; k < 10; k++) {
            if(k == 7) {
                System.out.println("k == 7");
                break;
            }
            System.out.println(" k = " + k);

        }
    }
}
