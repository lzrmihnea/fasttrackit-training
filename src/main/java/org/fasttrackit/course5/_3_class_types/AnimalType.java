package org.fasttrackit.course5._3_class_types;

public enum AnimalType {
    MAMMAL("anywhere there's land"),
    REPTILE("anywhere there's heat"),
    INVERTEBRATES("in small places");

    private String usuallyFoundWhere;

    AnimalType(String found) {
        this.usuallyFoundWhere = found;
    }


//    AnimalType() {
//
//    }

    public String getUsuallyFoundWhere() {
        return usuallyFoundWhere;
    }
}
