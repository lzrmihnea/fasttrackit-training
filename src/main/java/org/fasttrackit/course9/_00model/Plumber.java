package org.fasttrackit.course9._00model;

public class Plumber implements Human {
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String givenName) {
        this.name = givenName;
    }

    @Override
    public String toString() {
        return "Plumber{" +
                "name='" + name + '\'' +
                '}';
    }
}
