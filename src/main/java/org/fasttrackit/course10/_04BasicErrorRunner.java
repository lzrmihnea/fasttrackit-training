package org.fasttrackit.course10;

public class _04BasicErrorRunner {

    public static void main(String[] args) {
        calculateMyDouble(10.0);
    }

    private static void calculateMyDouble(double toCalculate) {
        System.out.println(toCalculate);
//        if(toCalculate >= Double.MAX_VALUE) {
//            System.out.println("HOOOOOU");
//            return;
//        }

        calculateMyDouble(toCalculate * 2);
    }
}
