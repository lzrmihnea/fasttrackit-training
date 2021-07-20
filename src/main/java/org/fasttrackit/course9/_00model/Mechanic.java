package org.fasttrackit.course9._00model;

public class Mechanic implements Human {
    private String name;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String givenName) {
        this.name = givenName;
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "name='" + name + '\'' +
                '}';
    }
}
