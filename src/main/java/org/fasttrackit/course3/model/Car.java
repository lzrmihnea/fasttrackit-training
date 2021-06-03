package org.fasttrackit.course3.model;

public class Car {
    private String brand; // text value
    private int numberOfDoors; // defaults to 0
    private Integer numberOfWheels; // default to null
    //model
    //color
    //numberOfWheels

    // default constructor, explicitly declared
    // has no return type (unlike a method)
    // This already exists, if we don't declare any explicit constructor.
    public Car() {
    }
    // another constructor
    public Car(String givenBrand) {
        brand = givenBrand;
    }

    // overloaded method
    public String driveItself(String location) {
        System.out.println("Vruuum vruuuum, mergem la " + location);
        return "Am ajuns la " + location;
    }
    // overloaded method
    public String driveItself() {
        return "Abc";
    }
    // overloaded method
    public String driveItself(int numberOfKilometers) {
        return "Am condus " + numberOfKilometers + " km.";
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public Integer getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(Integer numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
}
