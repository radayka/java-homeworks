package ru.otus.java.basic.homeworks.hw07;

public class homework07 {
    public static void main(String[] args) {
        int[][] array = {{1, 0, 0, 1},
                {0, 2, 0, 1},
                {0, 1, 3, 10},
                {0, 1, 3, 11}};

        System.out.println(sumOfPositiveElements(array));
        doASquare(10);
        zeroingDiagonalValues(array);
        System.out.println(findMax(array));
        System.out.println(sumOfElementsSecondString(array));
    }

    public static void print2dArrStr(String[][] array) {
        for (String[] strings : array) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
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
        String[][] square = new String[size][size];
        for (int i = 0; i < size; i++) {
            square[0][i] = "*";
            square[i][0] = "*";
            square[size - 1][i] = "*";
            square[i][size - 1] = "*";
        }
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                if (square[i][j] == null) {
                    square[i][j] = " ";
                }
            }
        }
        print2dArrStr(square);
    }

    public static void zeroingDiagonalValues(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 0;
        }
        print2dArrInt(array);
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

    public static int sumOfElementsSecondString(int[][] array) {
        if (array.length > 1) {
            int sum = 0;
            for (int i = 0; i < array[1].length; i++) {
                sum += array[1][i];
            }
            return sum;
        }
        return -1;
    }
}
