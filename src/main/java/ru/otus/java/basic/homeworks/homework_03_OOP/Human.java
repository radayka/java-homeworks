package ru.otus.java.basic.homeworks.homework_03_OOP;

public class Human {
    private final String name;
    private Transport currentTransport;

    public Human(String name) {
        this.name = name;
    }

    public Transport getCurrentTransport() {
        return currentTransport;
    }

    public boolean move(Locality locality, int distance) {
        if (currentTransport == null) {
            currentTransport = new OnFoot();
            currentTransport.move(locality, distance);
            return true;
        }
        currentTransport.move(locality, distance);
        return true;
    }

    public void mount(Transport newTransport) {
        currentTransport = newTransport;
        System.out.println("Человек- " + name + " сел за транспорт: " + newTransport.getName());
    }

    public void disMount() {
        System.out.println("Человек- " + name + " слез с транспорта: " + getCurrentTransport().getName());
        currentTransport = new OnFoot();
    }

}
