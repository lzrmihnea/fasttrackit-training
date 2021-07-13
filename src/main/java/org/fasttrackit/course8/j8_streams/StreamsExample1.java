package org.fasttrackit.course8.j8_streams;

import java.time.Year;
import java.util.*;
import java.util.stream.Collectors;

public class StreamsExample1 {
    public static void main(String[] args) {
        List<Car> carsOnOlx = new ArrayList<>();
        carsOnOlx.add(new Car(1, "Audi", "A7", Year.of(2006)));
        carsOnOlx.add(new Car(2, "Mercedes", "C classe", Year.of(2012)));
        carsOnOlx.add(new Car(3, "Tesla", "Model S", Year.of(2018)));

        System.out.println(carsOnOlx);

        /**
         * All collections have .stream() as a method
         */
        System.out.println("\n Cars after 2011");
        carsOnOlx.stream()
                .filter(car -> car.getYear().isAfter(Year.of(2011)))
                .forEach(car -> System.out.println(car));

        // Enhanced for syntax
        System.out.println("\n enhanced for");
        for(Car singleCar : carsOnOlx) {
            System.out.println(singleCar);
        }

        // .forEach syntax
        System.out.println("\n .forEach()");
        carsOnOlx.forEach(singleCar -> System.out.println(singleCar));

        // From a List of Cars, we want to get a List of Brand Names
        System.out.println("\n Creating List of Brand names using .forEach()");
        List<String> brandNames = new ArrayList<>();
        carsOnOlx.forEach(singleCar -> brandNames.add(singleCar.getBrand()));
        System.out.println(brandNames);

        System.out.println("\n Creating List of Brand names using enhanced for");
        List<String> brandNames2 = new ArrayList<>();
        for (Car singleCar : carsOnOlx) {
            brandNames2.add(singleCar.getBrand());
        }
        System.out.println(brandNames2);

        System.out.println("\n Creating List of Brand names using .stream().map()");
        final Set<String> brandNames3 =
                carsOnOlx
                        .stream()
                        .map(singleCar -> singleCar.getBrand())
                        .collect(Collectors.toSet());
        System.out.println(brandNames3);


        Map<String, Car> carById = new HashMap<>();
    }
}
