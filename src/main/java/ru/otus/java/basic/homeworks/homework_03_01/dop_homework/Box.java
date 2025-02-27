package ru.otus.java.basic.homeworks.homework_03_01.dop_homework;

import java.util.Arrays;

public class Box {

    private boolean isOpen;

    private final int size;
    private final String color;
    private boolean hasItem = false;
    private final String[] itemList = new String[1];


    public Box(String color, int size) {
        this.color = color;
        this.size = size;
    }

    public void open(Box box) {
        box.isOpen = true;
        System.out.println("Коробка открыта");
    }

    public void close(Box box) {
        box.isOpen = false;
        System.out.println("Коробка закрыта");
    }

    public void info(Box box) {
        System.out.println();
        System.out.println("Цвет коробки: " + box.color);
        System.out.println("Размер коробки: " + box.size);
        System.out.println("В коробке есть: " + box.itemList[0]);
        System.out.println();
    }

    public void addItem(Box box, String item) {
        if (!box.hasItem) {
            if (box.isOpen) {
                Arrays.fill(itemList, item);
            }
        }
        box.hasItem = true;
        System.out.println("Предмет " + item + " положили в коробоку");
    }

    public void deleteItem(Box box) {
        if (box.hasItem) {
            System.out.println("Предмет " + itemList[0] + " выкинули из коробоки");
            Arrays.fill(itemList, "ничего");
        }
        box.hasItem = false;
    }
}
