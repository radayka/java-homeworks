package ru.otus.java.basic.homeworks.homework_03_OOP;

public class Car implements TypesOfMovement {
    private int fuel;

    public Car(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean move(Locality locality, int distance) {
        if (locality.equals(Locality.SWAMP)) {
            System.out.println("Невозможно передвигаться на машине по болоту");
            return false;
        } else if (locality.equals(Locality.DENSE_FOREST)) {
            System.out.println("Невозможно передвигаться на машине по лесу");
            return false;
        }
        fuel -= distance;
        System.out.println("Было проехано " + distance + " метров на машине");
        return true;
    }

    @Override
    public String getName() {
        return "Машина";
    }
}
