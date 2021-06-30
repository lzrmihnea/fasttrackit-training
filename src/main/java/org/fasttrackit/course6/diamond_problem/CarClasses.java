package org.fasttrackit.course6.diamond_problem;

class Car { }

class TunedCar extends Car { }

class Human {
    Car getCar() { return new Car(); }
    void setCar(Car carToSet) { /*nothing*/ }
}

class Professor extends Human {
    @Override // when overriding, we can return subclasses of the above method's return type
    TunedCar getCar() { return new TunedCar(); }
    @Override
    void setCar(Car carToSet) { super.setCar(carToSet); }
}

class DiamondProblemRunner {
    public static void main(String[] args) {
        Human h1 = new Professor();
        Car car = h1.getCar(); // we don't care if it's a Car or TunedCar, both are safe here
    }
}