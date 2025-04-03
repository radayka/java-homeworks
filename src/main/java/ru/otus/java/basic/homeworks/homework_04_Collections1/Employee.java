package ru.otus.java.basic.homeworks.homework_04_Collections1;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    public String getName() {
        return name;
    }

    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static List<String> getArrayOfNames(List<Employee> employees) {
        List<String> list = new ArrayList<>();
        for (Employee employee : employees) {
            list.add(employee.name);
        }
        return list;
    }

    public static List<String> checkAgeLimit(List<Employee> employees, int minAge) {
        List<String> list = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.age >= minAge) {
                list.add(employee.name);
            }
        }
        return list;
    }

    public static boolean checkAverageAge(List<Employee> employees, int minAvgAge) {
        int allAge = 0;
        for (Employee employee : employees) {
            allAge += employee.age;
        }
        int avrAge = allAge / employees.size();
        return avrAge > minAvgAge;
    }

    public static Employee getTheYongestEmployee(List<Employee> employees) {
        Employee yongest = employees.getFirst();
        for (Employee employee : employees) {
            if (employee.age < yongest.age) {
                yongest = employee;
            }
        }
        return yongest;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
