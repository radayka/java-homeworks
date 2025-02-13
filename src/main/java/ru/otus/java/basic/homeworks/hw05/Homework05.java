package ru.otus.java.basic.homeworks.hw05;

public class Homework05 {
    public static void main(String[] args) {
        int[] array = {10, 15, 6, 3, 1, 2};
        scannerAndPrint(3, "Mummy");
        sumArrElAndPrint(array);
    }

    public static void scannerAndPrint(int number, String word) {
        for (int i = 0; i < number; i++) {
            System.out.println(word);
        }
    }

    public static void sumArrElAndPrint(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            if (j > 5) {
                sum += j;
            }
        }
        System.out.println(sum);
    }
}
