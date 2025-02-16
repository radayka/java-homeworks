package ru.otus.java.basic.homeworks.hw07;

public class homework07 {
    public static void main(String[] args) {
        int[][] array = {{5,7,3,17},
                         {7,0,1,12},
                         {8,1,2,3}};
        sumOfPositiveElements(array);
    }

    public static void sumOfPositiveElements(int[][] array) {
        int count = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] > 0) {
                    count += array[i][j];
                }
            }
        }
        System.out.println(count);
    }
}
