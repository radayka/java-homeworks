package ru.otus.java.basic.homeworks.homework_04_Algorithms;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alexander", Position.DEVELOPER, 1L);
        Person person2 = new Person("Maxim", Position.QA, 2L);
        Person person3 = new Person("Igor", Position.MANAGER, 3L);
        Person person4 = new Person("Eduard", Position.SENIOR_MANAGER, 4L);
        Person person5 = new Person("Alex", Position.BRANCH_DIRECTOR, 5L);
        List<Person> personList = List.of(person1, person2, person3, person4, person5);
        PersonDataBase personDataBase = new PersonDataBase(personList);

        personDataBase.add(new Person("Andrey", Position.DEVELOPER, 6L));
        System.out.println(personDataBase.findById(5L));
        System.out.println(personList);
    }
}
