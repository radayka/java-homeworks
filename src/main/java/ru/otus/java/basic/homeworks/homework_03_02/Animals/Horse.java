package ru.otus.java.basic.homeworks.homework_03_02.Animals;

public class Horse extends Animal {

    public Horse(String name, int runningSpeed, int swimmingSpeed, int endurance) {
        super(name, runningSpeed, swimmingSpeed, endurance);
    }

    @Override
    public double swim(int distance) {
        double time = distance / swimmingSpeed;
        endurance -= distance * 4;
        if (endurance < 0) {
            System.out.println("У животного появилась усталость");
            return -1;
        }
        System.out.println(name + " проплыла " + distance + "м" + " за " + time + "с");
        return time;
    }
}
