package ru.otus.java.basic.homeworks.homework_03_OOP;

public class Rover implements Transport {
    public Rover(int fuel) {
        this.fuel = fuel;
    }

    private int fuel;

    @Override
    public boolean move(Locality locality, int distance) {
        if (fuel < distance) {
            System.out.println("Недостаточно топлива!");
            return false;
        }
        fuel -= distance;
        System.out.println("Было проехано " + distance + " метров на вездеходе");
        return true;
    }

    @Override
    public String getName() {
        return "Вездеход";
    }
}
