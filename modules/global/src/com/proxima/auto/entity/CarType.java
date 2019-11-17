package com.proxima.auto.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum CarType implements EnumClass<String> {

    CROSSOVER("A"),
    WAGON("B"),
    SEDAN("C"),
    SPORT_CAR("D"),
    SUV("E");

    private String id;

    CarType(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static CarType fromId(String id) {
        for (CarType at : CarType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}