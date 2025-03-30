package ru.otus.java.basic.homeworks.homework_03_OOP;

public class Main {
    public static void main(String[] args) {
        Human max = new Human("Max");
        Car car = new Car(100);
        max.mount(car);
        max.move(Locality.PLAIN, 50);
        max.disMount();
    }
}
