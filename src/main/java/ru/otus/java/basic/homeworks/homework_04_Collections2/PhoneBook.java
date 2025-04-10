package ru.otus.java.basic.homeworks.homework_04_Collections2;

import java.util.*;

public class PhoneBook {
    Map<String, Set<String>> phoneBook = new TreeMap<>();

    public void add(String name, String phone) {
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phone);
        } else {
            phoneBook.put(name, new HashSet<>() {{
                add(phone);
            }});
        }
    }

    public Set<String> find(String person) {
        return phoneBook.getOrDefault(person, Collections.emptySet());
    }

    public boolean containsPhoneNumber(String number) {
        for (String key : phoneBook.keySet()) {
            if (phoneBook.get(key).contains(number)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return phoneBook.toString();
    }
}
