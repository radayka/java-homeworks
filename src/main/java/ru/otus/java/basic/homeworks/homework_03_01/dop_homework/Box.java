package ru.otus.java.basic.homeworks.homework_03_01.dop_homework;

import java.util.Arrays;

public class Box {

    private boolean isOpen;

    private final int size;
    private String color;
    private boolean hasItem = false;
    private String[] itemL = new String[1];


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
        System.out.println("Цвет коробки: " + box.color);
        System.out.println("Размер коробки: " + box.size);
        System.out.println("В коробке есть: " + box.itemL[0]);
    }

    public void addItem(Box box, String item) {
        if (!box.hasItem) {
            if (box.isOpen) {
                Arrays.fill(itemL, item);
            }
        }
    }

    public void deleteItem(Box box) {
        if(box.hasItem) {
            if (box.isOpen) {
                Arrays.fill(itemL, "пустота");
            }
        }
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHasItem() {
        return hasItem;
    }

    public void setHasItem(boolean hasItem) {
        this.hasItem = hasItem;
    }

    public String[] getItemL() {
        return itemL;
    }

    public void setItemL(String[] itemL) {
        this.itemL = itemL;
    }
}
