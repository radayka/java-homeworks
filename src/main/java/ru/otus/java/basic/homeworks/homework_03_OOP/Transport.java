package ru.otus.java.basic.homeworks.homework_03_OOP;

public interface Transport {
    boolean move(Locality locality, int distance);

    String getName();
}
