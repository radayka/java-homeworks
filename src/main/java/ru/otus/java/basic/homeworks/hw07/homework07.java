package ru.otus.java.basic.homeworks.hw07;

public class homework07 {
    public static void main(String[] args) {
        int[][] array = {{1, 0, 0, 1},
                        {0, 2, 0, 1},
                        {0, 1, 3, 10},
                        {0, 1, 3, 11}};

        System.out.println(sumOfPositiveElements(array));
        doASquare(5);
        zeroingDiagonalValues(array);
        print2dArrInt(array);
        System.out.println(findMax(array));
        System.out.println(sumElementsOfSecondRow(array));
    }

    public static void print2dArrInt(int[][] array) {
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public static int sumOfPositiveElements(int[][] array) {
        int count = 0;
        for (int[] ints : array) {
            for (int j = 0; j < array[0].length; j++) {
                if (ints[j] > 0) {
                    count += ints[j];
                }
            }
        }
        return count;
    }

    public static void doASquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void zeroingDiagonalValues(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 0;
        }
    }

    public static int findMax(int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : array) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }

    public static int sumElementsOfSecondRow(int[][] array) {
        if (array.length >= 2) {
            int sum = 0;
            for (int i = 0; i < array[1].length; i++) {
                sum += array[1][i];
            }
            return sum;
        }
        return -1;
    }
}
