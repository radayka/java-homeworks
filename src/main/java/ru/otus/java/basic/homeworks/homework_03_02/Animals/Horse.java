package ru.otus.java.basic.homeworks.homework_03_02.Animals;

public class Horse extends Animal {

    public Horse(String name, int runningSpeed, int swimmingSpeed, int endurance) {
        super(name, runningSpeed, swimmingSpeed, endurance);
        coef = 4;
    }
}
