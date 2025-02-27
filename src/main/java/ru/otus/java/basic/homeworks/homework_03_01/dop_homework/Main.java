package ru.otus.java.basic.homeworks.homework_03_01.dop_homework;

public class Main {
    public static void main(String[] args) {
        Box box = new Box("Красный",5);
        box.open(box);
        box.addItem(box,"Меч");
        box.info(box);

        box.deleteItem(box);
        box.info(box);
        box.close(box);

    }
}
