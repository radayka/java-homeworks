package ru.otus.java.basic.homeworks.homework_03_OOP;

public class OnFoot implements TypesOfMovement {
    @Override
    public boolean move(Locality locality, int distance) {
        System.out.println("Было пройдено " + distance + " метров пешком");
        return true;
    }

    @Override
    public String getName() {
        return "Пешком";
    }
}
