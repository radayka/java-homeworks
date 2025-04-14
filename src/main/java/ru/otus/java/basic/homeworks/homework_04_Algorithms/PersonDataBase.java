package ru.otus.java.basic.homeworks.homework_04_Algorithms;

import java.util.*;

public class PersonDataBase {

    public Map<Long, Person> persons;
    Set<Position> positionSetOfManager = new HashSet<>(Arrays.asList(Position.MANAGER, Position.DIRECTOR, Position.SENIOR_MANAGER, Position.BRANCH_DIRECTOR));

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
        return positionSetOfManager.contains(person.position());
    }

    public boolean isEmployee(Long id) {
        return !isManager(persons.get(id));
    }
}
