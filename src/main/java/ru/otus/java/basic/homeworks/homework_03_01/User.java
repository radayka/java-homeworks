package ru.otus.java.basic.homeworks.homework_03_01;

public record User(String surname, String name, String patronymic, int yearOfBirth, String email) {

    public void info() {
        System.out.println("ФИО: " + surname + " " + name + " " + patronymic);
        System.out.println("Год рождения: " + yearOfBirth);
        System.out.println("e-mail: " + email);
    }
}

