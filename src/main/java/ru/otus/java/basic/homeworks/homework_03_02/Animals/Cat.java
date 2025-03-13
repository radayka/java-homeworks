package ru.otus.java.basic.homeworks.homework_03_02.Animals;

public class Cat extends Animal{

    public Cat(String name, int runningSpeed, int swimmingSpeed, int endurance) {
        super(name, runningSpeed, swimmingSpeed, endurance);
    }

    @Override
    public int run(int distance){
        return 1;
    }
    @Override
    public int swim(int distance){
        return  1;
    }
}
