package org.fasttrackit.course19;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Year;

public class CarDemo {
    public static void main(String[] args) {
        Car originalCar = new Car();
        originalCar.setId(1L);
        originalCar.setCreationDate(Date.valueOf(LocalDate.of(1991, 5, 7)));
        originalCar.setSeries("BMWIX7");
        originalCar.setModel("7");
        originalCar.setBrand("BMW");
        originalCar.setYear(Year.of(2009));
        System.out.println("Original car: " + originalCar);

        Car clonedCar = originalCar.clone();
        System.out.println("Cloned car: " + clonedCar);
    }
}
