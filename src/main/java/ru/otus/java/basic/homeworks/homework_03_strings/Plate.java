package ru.otus.java.basic.homeworks.homework_03_strings;

public class Plate {
    private int maxCapacity;

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    private int currentCapacity;

    public Plate(int maxCapacity, int currentCapacity) {
        this.maxCapacity = maxCapacity;
        this.currentCapacity = currentCapacity;
    }

    public void addFood(int food) {
        if (currentCapacity + food <= maxCapacity) {
            currentCapacity += food;
            System.out.println("Еда добавлена");
        }
        System.err.println("В тарелке нет места");
    }

    public boolean removeFood(int food) {
        if (currentCapacity - food >= 0) {
            currentCapacity -= food;
            System.out.println("Еда убрана с тарелки");
            return true;
        }
        System.err.println("Нечего убирать");
        return false;
    }
}
