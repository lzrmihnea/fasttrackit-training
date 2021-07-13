package org.fasttrackit.course8.j8_streams;

import java.time.Year;

public class Car {
    int id;
    String brand;
    String model;
    Year year;

    public Car(int id, String brand, String model, Year year) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Year getYear() {
        return year;
    }

    void printMe(String something) {

    }
}
