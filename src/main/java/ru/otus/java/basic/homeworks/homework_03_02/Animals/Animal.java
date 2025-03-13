package ru.otus.java.basic.homeworks.homework_03_02.Animals;

public abstract class Animal {
    String name;
    int runningSpeed;
    int swimmingSpeed;
    int endurance;

    public Animal(String name, int runningSpeed, int swimmingSpeed, int endurance) {
        this.name = name;
        this.runningSpeed = runningSpeed;
        this.swimmingSpeed = swimmingSpeed;
        this.endurance = endurance;
    }

    public abstract int run(int distance);
    public abstract int swim(int distance);

}
