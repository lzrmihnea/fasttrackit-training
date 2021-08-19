package org.fasttrackit.springdemo.repository;

import org.fasttrackit.springdemo.model.Human;

import java.util.ArrayList;
import java.util.List;

public class Repository<T extends Human> {

    public List<T> getAll() {
        return new ArrayList<>();
    }

    public void add(T toAdd) {
        // TODO
    }
}
