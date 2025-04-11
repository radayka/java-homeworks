package ru.otus.java.basic.homeworks.homework_04_Algorithms;

import java.util.Objects;

public class Person {
    private final String name;
    private final Position position;
    private final Long id;

    public Long getId() {
        return id;
    }


    public Person(String name, Position position, Long id) {
        this.name = name;
        this.position = position;
        this.id = id;
    }

    @Override
    public String toString() {
        return name;
    }
}