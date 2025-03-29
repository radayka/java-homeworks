package ru.otus.java.basic.homeworks.homework_03_OOP;

public class Bicycle implements TypesOfMovement {
    @Override
    public boolean move(Locality locality, int distance) {
        if (locality.equals(Locality.SWAMP)) {
            System.out.println("Невозможно передвигаться на велосипеде по болоту");
            return false;
        }
        System.out.println("Было проехано " + distance + " метров на велосипеде");
        return true;
    }

    @Override
    public String getName() {
        return "Велосипед";
    }
}
