package ru.otus.java.basic.homeworks.hw03;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        int n = 0;
        while (n < 5) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число от 1 до 5");
            int initNum = scanner.nextInt();
            switch (initNum) {
                case 1:
                    greetings();
                    break;
                case 2:
                    double randomNum = (Math.random() * 100) + 1;
                    double randomNum2 = (Math.random() * 100) + 1;
                    double randomNum3 = (Math.random() * 100) + 1;
                    checkSign((int) randomNum, (int) randomNum2, (int) randomNum3);
                    break;
                case 3:
                    selectColor();
                    break;
                case 4:
                    compareNumbers();
                    break;
                case 5:
                    double initValue = (Math.random() * 100) + 1;
                    double delta = (Math.random() * 100) + 1;
                    boolean increment = ((int) (Math.random() * 100)) % 2 == 1;
                    addOrSubtractAndPrint((int) initValue, (int) delta, increment);
                    break;
                default:
                    System.out.println("Вы ввели число вне диапазона");
                    break;
            }
            n++;
        }
    }

    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava");
    }

    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor() {
        double data = (Math.random() * 30) + 1;
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data > 10 && data <= 20) {
            System.out.println("Желтый");
        } else if (data > 20) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = (int) (Math.random() * 100) + 1;
        int b = (int) (Math.random() * 100) + 1;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            initValue += delta;
            System.out.println(initValue);
        } else {
            initValue -= delta;
        }
    }
}
