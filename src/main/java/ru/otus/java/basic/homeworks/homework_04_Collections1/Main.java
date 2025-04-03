package ru.otus.java.basic.homeworks.homework_04_Collections1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    }

    public static List<Integer> thirstTask(Integer min, Integer max) {
        List<Integer> list = new ArrayList<>();
        for (int i = min; i < max + 1; i++) {
            list.add(i);
        }
        return list;
    }

    public static Integer secondTask(List<Integer> list) {
        int count = 0;
        for (Integer integer : list) {
            if (integer > 5) {
                count += integer;
            }
        }
        return count;
    }

    public static void thirdTask(int digit, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                list.set(i, digit);
            }
        }
    }

    public static void fourthTask(List<Integer> list, int digit) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + digit);
        }
    }
}
