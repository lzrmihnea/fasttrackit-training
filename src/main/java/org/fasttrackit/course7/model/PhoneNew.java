package org.fasttrackit.course7.model;

import org.fasttrackit.course7.model.Phone;

import java.util.Objects;

public class PhoneNew extends Phone {

    public PhoneNew(String brand, String model) {
        super(brand, model);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Objects.equals(brand, phone.brand) && Objects.equals(model, phone.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model);
    }
}
