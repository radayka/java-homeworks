package ru.otus.java.basic.homeworks.homework_03_OOP;

public class Human {
    private final String name;
    private TypesOfMovement currentTypesOfMovement;

    public Human(String name) {
        this.name = name;
    }

    public TypesOfMovement getCurrentTransport() {
        return currentTypesOfMovement;
    }

    public void move(Locality locality, int distance) {
        if (currentTypesOfMovement == null) {
            currentTypesOfMovement = new OnFoot();
            currentTypesOfMovement.move(locality, distance);
            return;
        }
        currentTypesOfMovement.move(locality, distance);
    }

    public void mount(TypesOfMovement newTypesOfMovement) {
        currentTypesOfMovement = newTypesOfMovement;
        System.out.println("Человек- " + name + " сел за транспорт: " + newTypesOfMovement.getName());
    }

    public void disMount() {
        System.out.println("Человек- " + name + " слез с транспорта: " + getCurrentTransport().getName());
        currentTypesOfMovement = new OnFoot();
    }

}
