package org.fasttrackit.course10.logging;

public class ServiceRunner {

    static CalculationService service = new CalculationService();

    public static void main(String[] args) {

        System.out.println(service.getArea("-100", "doi"));
    }
}
