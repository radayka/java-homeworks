package ru.otus.java.basic.homeworks.homework_03_01.dop_homework;

public class Box {

    private boolean isOpen;
    private final int size;
    private final String color;

    public Box(String color, int size) {
        this.color = color;
        this.size = size;
        this.isOpen = false;
    }

    public void openBox(Box box) {
        box.isOpen = true;
        System.out.println("Коробка открыта");
    }

    public void closeBox(Box box) {
        box.isOpen = false;
        System.out.println("Коробка закрыта");
    }

    public void printBox(Box box) {
        System.out.println("Цвет коробки: " + box.color);
        System.out.println("Размер коробки: " + box.size);
        System.out.println();
    }

    public static void addItem(Box box, String item) {
        if (box.isOpen) {
            String[] list = new String[box.size];
            for (int i = 0; i < list.length; i++) {
                if (list[i].isBlank()) {
                    list[i] = item;
                }
            }
        }
        System.out.println("Предмет " + item + " добавлен");
    }

//    public static void deleteItem(Box box, String item) {
//        if (!box.isOpen) {
//            for (int i = 0; i < box.size; i++) {
//                if()
//            }
//        }
//    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}
