package ru.otus.java.basic.homeworks.homework_03_OOP;

public class Main {
    public static void main(String[] args) {
        Human max = new Human("Max");
        Horse iskra = new Horse();
        max.mount(iskra);
        max.dismount(iskra);
        System.out.println(max.getName());
    }
}
