package org.fasttrackit.course6.polymorphism;

public class CarRunner {
    public static void main(String[] args) {
        createCar("aro").drive();
        createCar("monster").drive();
        createCar("audi").drive();
        createCar("tuned").drive();
        createCar("logan mcv").drive();
        createCar("bmw").drive();
        createCar("mustang").drive();
    }

    /**
     * JavaDoc: here we use Polymorphism to create an instance
     * of Car (not knowing whether it's a Car or a Subclass of Car)
     */
    static Car createCar(String type) {
        switch (type) {
            case "tuned" : return new TunedCar();
            case "monster": return new MonsterTruck();
            case "aro": return new Aro();
            default: return new Car();
        }
    }
}
