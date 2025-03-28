package ru.otus.java.basic.homeworks.homework_03_strings;

public class Cat {
    public String getName() {
        return name;
    }

    private String name;
    private int appetit;

    public boolean isFullness() {
        return fullness;
    }

    private boolean fullness;

    public Cat(String name, int appetit) {
        this.name = name;
        this.appetit = appetit;
        this.fullness = false;
    }

    public void eat(Plate plate) {
        if (plate.tryTakeFood(appetit)) {
            fullness = true;
            System.out.println("Кот " + name + " поел");
            System.out.println("В тарелке осталось " + plate.getCurrentCapacity() + " еды");
        }
    }
}
