package ru.otus.java.basic.homeworks.homework_03_02.Animals;

public class Dog extends Animal {

    public Dog(String name, int runningSpeed, int swimmingSpeed, int endurance) {
        super(name, runningSpeed, swimmingSpeed, endurance);
    }

    @Override
    public double swim(int distance) {
        double time = distance / swimmingSpeed;
        endurance -= distance * 2;
        if (endurance < 0) {
            System.out.println("У животного появилась усталость");
            return -1;
        }
        System.out.println(name + " проплыл " + distance + "м" + " за " + time + "с");
        return time;
    }
}
