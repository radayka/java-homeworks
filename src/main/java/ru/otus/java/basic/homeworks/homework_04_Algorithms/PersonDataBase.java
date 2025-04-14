package ru.otus.java.basic.homeworks.homework_04_Algorithms;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonDataBase {
    public Map<Long, Person> persons;

    public PersonDataBase(List<Person> personList) {
        persons = new HashMap<>();
        personList.forEach(p -> persons.put(p.id(), p));
    }

    public Person findById(Long id) {
        return persons.get(id);
    }

    public void add(Person person) {
        persons.put(person.id(), person);
    }

    public boolean isManager(Person person) {
        return person.position() == Position.MANAGER || person.position() == Position.DIRECTOR || person.position() == Position.BRANCH_DIRECTOR || person.position() == Position.SENIOR_MANAGER;
    }

    public boolean isEmployee(Long id) {
        return !isManager(persons.get(id));
    }

    public static void bubbleSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                int temp = array[j];
                if (array[j] > array[j + 1]) {
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
