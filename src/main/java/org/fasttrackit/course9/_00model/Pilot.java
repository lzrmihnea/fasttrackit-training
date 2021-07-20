package org.fasttrackit.course9._00model;

import java.time.LocalDate;

public class Pilot implements Human {
    private String name;
    private LocalDate dateOfHiring;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String givenName) {
        this.name = givenName;
    }

    public LocalDate getDateOfHiring() {
        return dateOfHiring;
    }

    public void setDateOfHiring(LocalDate dateOfHiring) {
        this.dateOfHiring = dateOfHiring;
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "name='" + name + '\'' +
                ", dateOfHiring=" + dateOfHiring +
                '}';
    }
}
