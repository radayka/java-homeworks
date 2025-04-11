package ru.otus.java.basic.homeworks.homework_04_Algorithms;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonDataBase {
    public Map<Long, Person> persons;

    public PersonDataBase(List<Person> personList) {
        persons = new HashMap<>();
        personList.forEach(p -> persons.put(p.getId(), p));
    }

    public Person findById(Long id) {
        return persons.get(id);
    }

    public void add(Person person) {
        persons.put(person.getId(), person);
    }

    public boolean isManager(Person person) {
        return false;
    }

    public boolean isEmployee(Long id) {
        return false;
    }
}
