package org.fasttrackit.course9._03container;

import org.fasttrackit.course9._00model.Human;

public class HumanWrapper<T extends Human> {
    T value;

    HumanWrapper(T givenValue) {
        this.value = givenValue;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T givenValue) {
        this.value = givenValue;
    }
}
