package ru.otus.java.basic.homeworks.homework_03_02.Animals;

public class Animal {
    String name;
    double runningSpeed;
    double swimmingSpeed;
    int endurance;
    int coef = 0;

    public Animal(String name, int runningSpeed, int swimmingSpeed, int endurance) {
        this.name = name;
        this.runningSpeed = runningSpeed;
        this.swimmingSpeed = swimmingSpeed;
        this.endurance = endurance;
    }

    public void info() {
        System.out.println("Name: " + name);
        System.out.println("RunningSpeed: " + runningSpeed);
        System.out.println("SwimmingSpeed: " + swimmingSpeed);
        System.out.println("Endurance: " + endurance);
        System.out.println();
    }

    public double run(int distance) {
        if (endurance <= 0) {
            System.out.println("У " + name + " появилась усталость");
            return -1;
        }
        double time = distance / swimmingSpeed;
        endurance -= distance;
        System.out.println(name + " пробежала " + distance + "м" + " за " + time + "с");
        return time;
    }

    public double swim(int distance) {
        if (endurance <= 0) {
            System.out.println("У " + name + " появилась усталость");
            return -1;
        }
        double time = distance / swimmingSpeed;
        endurance -= distance * coef;
        System.out.println(name + " проплыл " + distance + "м" + " за " + time + "с");
        return time;
    }

}
