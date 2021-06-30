package org.fasttrackit.course6.shadow;

class Car {
    public String name = "car name";
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}

class FastCar extends Car {
    public String name = "fast car name";
    public String getName() {return name;}
    public void setName(String name) { this.name = name; }
}

class CarShadowingExample {
    public static void main(String[] args) {
        Car car1 = new FastCar();
        car1.name = "Tesla"; // (shadowing) when referencing fields, we are calling the Reference (Car class)
        System.out.println(car1.getName()); // (overriding) when referencing methods, we are calling the Instance (FastCar)
    }
}