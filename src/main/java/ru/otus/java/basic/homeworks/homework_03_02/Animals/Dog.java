package ru.otus.java.basic.homeworks.homework_03_02.Animals;

public class Dog extends Animal {

    public Dog(String name, int runningSpeed, int swimmingSpeed, int endurance) {
        super(name, runningSpeed, swimmingSpeed, endurance);
        coef = 2;
    }
}
