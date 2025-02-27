package ru.otus.java.basic.homeworks.homework_03_01;

public record User(String surname, String name, String patronymic, int yearOfBirth, String email) {

    public static void info(User user) {
        System.out.println("ФИО: " + user.surname + " " + user.name + " " + user.patronymic);
        System.out.println("Год рождения: " + user.yearOfBirth);
        System.out.println("e-mail: " + user.email);
    }
}

