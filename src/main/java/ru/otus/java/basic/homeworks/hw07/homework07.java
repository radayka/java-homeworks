package ru.otus.java.basic.homeworks.hw07;

import java.util.Arrays;

public class homework07 {
    public static void main(String[] args) {
        int[][] array = {{0, 0, 0, 17},
                {0, 0, 0, 12},
                {0, 1, 0, 0}};
        sumOfPositiveElements(array);
        printSquare(4);
    }

    public static void sumOfPositiveElements(int[][] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] > 0) {
                    count += array[i][j];
                }
            }
        }
        System.out.println(count);
    }

    public static void printSquare(int size) {
        int[][] square = new int[size][size];
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[0].length; j++) {
                System.out.println();
            }
        }
    }
}
