package ru.otus.java.basic.homeworks.homework_03_02.Animals;

public class Animal {
    String name;
    double runningEnduranceCost;
    double swimmingEnduranceCost;
    int endurance;
    int coef = 0;

    public Animal(String name, double runningEnduranceCost, int swimmingEnduranceCost, int endurance) {
        this.name = name;
        this.runningEnduranceCost = runningEnduranceCost;
        this.swimmingEnduranceCost = swimmingEnduranceCost;
        this.endurance = endurance;
    }

    public void info() {
        System.out.println("Name: " + name);
        System.out.println("RunningSpeed: " + runningEnduranceCost);
        System.out.println("SwimmingSpeed: " + swimmingEnduranceCost);
        System.out.println("Endurance: " + endurance);
        System.out.println();
    }

    public double run(int distance) {
        if (endurance <= 0) {
            System.out.println("У " + name + " появилась усталость");
            return -1;
        }
        double time = distance / swimmingEnduranceCost;
        endurance -= distance;
        System.out.println(name + " пробежала " + distance + "м" + " за " + time + "с");
        return time;
    }

    public double swim(int distance) {
        if (endurance <= 0) {
            System.out.println("У " + name + " появилась усталость");
            return -1;
        }
        double time = distance / swimmingEnduranceCost;
        endurance -= distance * coef;
        System.out.println(name + " проплыл " + distance + "м" + " за " + time + "с");
        return time;
    }

}
