package ru.otus.java.basic.homeworks.homework_03_02.Animals;

public class Cat extends Animal {

    public Cat(String name, int runningEnduranceCost, int swimmingEnduranceCost, int endurance) {
        super(name, runningEnduranceCost, swimmingEnduranceCost, endurance);
    }
    @Override
    public double swim(int distance){
        System.out.println(name + " не умеет плавать");
        return -1;
    }
}
