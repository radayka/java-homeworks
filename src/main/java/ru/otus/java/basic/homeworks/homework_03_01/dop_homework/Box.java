package ru.otus.java.basic.homeworks.homework_03_01.dop_homework;

public class Box {

    private boolean isOpen;
    private final int size;
    private final String color;
    private boolean hasItem = false;
    private String itemList;


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
        System.out.println("В коробке есть: " + box.itemList);
        System.out.println();
    }

    public void addItem(Box box, String item) {
        if (!box.hasItem) {
            if (box.isOpen) {
                box.itemList = item;
                box.hasItem = true;
                System.out.println("Предмет " + item + " положили в коробоку");
                return;
            }
            System.out.println("Не удалось положить предмет, потому что коробка закрыта");
            return;
        }
        System.out.println("Не удалось положить предмет, потому что в коробке уже есть предмет");
    }

    public void deleteItem(Box box) {
        if (box.hasItem) {
            System.out.println("Предмет " + box.itemList + " выкинули из коробоки");
            box.itemList = "Ничего";
        }
        box.hasItem = false;
    }
}
