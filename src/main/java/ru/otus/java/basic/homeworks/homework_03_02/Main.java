package ru.otus.java.basic.homeworks.homework_03_02;

import ru.otus.java.basic.homeworks.homework_03_02.Animals.Cat;
import ru.otus.java.basic.homeworks.homework_03_02.Animals.Dog;
import ru.otus.java.basic.homeworks.homework_03_02.Animals.Horse;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Murzik", 10, 0, 100);
        Dog dog = new Dog("Bars", 15, 5, 100);
        Horse horse = new Horse("Iskra", 20, 10, 100);

        cat.swim(100);
        cat.run(100);
        cat.info();

        dog.run(100);
        dog.swim(100);
        dog.info();

        horse.run(100);
        horse.swim(100);
        horse.info();
    }
}
