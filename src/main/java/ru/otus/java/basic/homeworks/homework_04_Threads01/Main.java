package ru.otus.java.basic.homeworks.homework_04_Threads01;

public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        dobleMasive();
        long end = System.currentTimeMillis();
        long durationMs = end - start;
        double durationMin = durationMs / 1000.0 / 60.0;
        System.out.println("Время выполнения: " + String.format("%.2f", durationMin) + " минут");
    }


    public static void dobleMasive() {
        int[] array = new int[100_000_000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2));
        }
    }
}
