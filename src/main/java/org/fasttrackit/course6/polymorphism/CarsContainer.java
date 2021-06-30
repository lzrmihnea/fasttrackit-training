package org.fasttrackit.course6.polymorphism;

class Car {
    public void drive() {
        System.out.println("vruuum");
    }
}

class TunedCar extends Car {
    @Override
    public void drive() {
        System.out.println("vruuum cu smecherie");
    }
}

class MonsterTruck extends Car {
    @Override
    public void drive() {
        System.out.println("vruuum cu mult fum");
    }
}

class Aro extends Car {
    @Override
    public void drive() {
        System.out.println("vruuum cu si mai mult fum");
    }
}
