package ru.otus.java.basic.homeworks.homework_03_OOP;

public class Horse implements Transport {
    private int endurance;

    public Horse(int endurance) {
        this.endurance = endurance;
    }

    @Override
    public boolean move(Locality locality, int distance) {
        if (endurance < distance) {
            System.out.println("Лошадь устала!");
            return false;
        }
        endurance -= distance;
        if (locality.equals(Locality.SWAMP)) {
            System.out.println("Невозможно передвигаться на лошади по болоту");
            return false;
        }
        endurance -= distance;
        System.out.println("Было пройдено " + distance + " метров на лошади");
        return true;
    }

    @Override
    public String getName() {
        return "Лошадь";
    }
}
