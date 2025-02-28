package ru.otus.java.basic.homeworks.homework_03_01;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Radaev", "Maksim", "Evgenivich", 2001, "maksimka.radaev@inbox.ru");
        User user2 = new User("Ivanova", "Anna", "Sergeevna", 1995, "anna.ivanova@gmail.com");
        User user3 = new User("Petrov", "Dmitry", "Alexandrovich", 1988, "dmitry.petrov@yahoo.com");
        User user4 = new User("Smirnova", "Elena", "Viktorovna", 1992, "elena.smirnova@mail.ru");
        User user5 = new User("Kozlov", "Andrey", "Igorevich", 2000, "andrey.kozlov@inbox.ru");
        User user6 = new User("Morozova", "Olga", "Dmitrievna", 1985, "olga.morozova@gmail.com");
        User user7 = new User("Volkov", "Sergey", "Pavlovich", 1998, "sergey.volkov@yahoo.com");
        User user8 = new User("Kuznetsova", "Tatiana", "Nikolaevna", 1990, "tatiana.kuznetsova@mail.ru");
        User user9 = new User("Fedorov", "Alexey", "Vladimirovich", 1987, "alexey.fedorov@inbox.ru");
        User user10 = new User("Sokolova", "Maria", "Andreevna", 1993, "maria.sokolova@gmail.com");
        User[] users = {user1, user2, user3, user4, user5, user6, user7, user8, user9, user10};

        for (User user : users) {
            if (user.yearOfBirth() <= 1985) {
                user.info();
            }
        }
    }
}
