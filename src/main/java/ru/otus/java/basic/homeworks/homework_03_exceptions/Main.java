package ru.otus.java.basic.homeworks.homework_03_exceptions;

public class Main {
    public static void main(String[] args) throws AppArrayDataException, AppArraySizeException {
        String[][] array = new String[][]{{"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "4", "12"},
                {"13", "14", "15", "16"}};
        sumArray(array, 4);

    }

    public static void sumArray(String[][] arr, int size) throws AppArraySizeException, AppArrayDataException {
        if (size != 4) {
            throw new AppArraySizeException("Unexpected array size " + size);
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (Exception e) {
                    throw new AppArrayDataException("Unexpected value in array at address" + i + j);
                }
            }
        }
        System.out.println(sum);
    }
}
