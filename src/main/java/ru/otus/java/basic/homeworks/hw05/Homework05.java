package ru.otus.java.basic.homeworks.hw05;

import java.util.Arrays;

public class Homework05 {
    public static void main(String[] args) {
        int[] array1 = {10, 15, 6, 3, 1, 2};
        int[] array2 = new int[10];
        int[] array3 = {10, 15, 6, 3, 1, 2};
        int[] array4 = {10, 15, 6, 3, 1, 2, 22, 3, 10};
        printWordNTimes(3, "Mummy");
        sumElementsAndPrint(array1);
        fillArrayEnteredDigit(array2, 5);
        incrementElementOfArrayByDigit(array3, 6);
        printWhichHalfIsBigger(array4);
    }

    public static void printWordNTimes(int times, String word) {
        System.out.println("Первый метод:");
        for (int i = 0; i < times; i++) {
            System.out.println(word + " ");
        }
    }

    public static void sumElementsAndPrint(int[] arr) {
        System.out.println("Второй метод:");
        int sum = 0;
        for (int j : arr) {
            if (j > 5) {
                sum += j;
            }
        }
        System.out.println(sum);
    }

    public static void fillArrayEnteredDigit(int[] arr, int digit) {
        System.out.println("Третий метод:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = digit;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void incrementElementOfArrayByDigit(int[] arr, int digit) {
        System.out.println("Четвертый метод:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] += digit;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void printWhichHalfIsBigger(int[] arr) {
        System.out.println("Пятый метод:");
        int thirstHalf = 0;
        int secondHalf = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            thirstHalf += arr[i];
        }
        for (int j = arr.length - 1; j > arr.length / 2; j--) {
            secondHalf += arr[j];
        }
        if (thirstHalf > secondHalf) {
            System.out.println("Первая половина больше: " + thirstHalf);
        } else {
            System.out.println("Вторая половина больше: " + secondHalf);
        }
    }
}

