package ru.otus.java.basic.homeworks.homework_03_02.Animals;

public class Horse extends Animal {

    public Horse(String name, int runningEnduranceCost, int swimmingEnduranceCost, int endurance) {
        super(name, runningEnduranceCost, swimmingEnduranceCost, endurance);
        coef = 4;
    }
}
