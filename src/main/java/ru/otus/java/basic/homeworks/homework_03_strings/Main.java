package ru.otus.java.basic.homeworks.homework_03_strings;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("barsik", 10);
        Cat murzik = new Cat("murzik", 20);
        Cat borzik = new Cat("borzik", 30);
        Cat chorzik = new Cat("chorzik", 40);
        Cat[] arrayOfCats = new Cat[]{barsik, murzik, borzik, chorzik};
        Plate plate = new Plate(1000);
        plate.addFood(200);
        plate.removeFood(200);
        for (Cat c : arrayOfCats) {
            c.eat(plate);
            if (c.isFullness()) {
                System.out.println("Кот наелся");
                System.out.println();
            }
        }
    }
}
