package ru.otus.java.basic.homeworks.homework_03_OOP;

public class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    private Transport currentTransport;

    public String getName() {
        return currentTransport.getName();
    }

    public void mount(Transport newTransport) {
        currentTransport = newTransport;
        System.out.println("Человек- " + name + " сел за транспорт: " + newTransport.getName());
    }

    public void dismount(Transport currentTransport) {
        System.out.println("Человек- " + name + " спешился c " + currentTransport.getName());
    }
}
