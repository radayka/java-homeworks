package ru.otus.java.basic.homeworks.homework_03_exceptions;

public class Main {
    public static void main(String[] args) throws AppArrayDataException, AppArraySizeException {
        String[][] array = new String[][]{
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "3", "12"},
                {"13", "14", "15", "16"}};
        System.out.println(sumArray(array));
    }

    public static int sumArray(String[][] arr) throws AppArraySizeException, AppArrayDataException {
        if (arr.length != 4 || arr[0].length != 4) {
            throw new AppArraySizeException("Unexpected array size " + arr.length);
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (Exception e) {
                    throw new AppArrayDataException(String.format("Ошибка в ячейке [%d][%d]", i, j));
                }
            }
        }
        return sum;
    }
}
