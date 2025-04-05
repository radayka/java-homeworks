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

    public static List<String> getEmployeeNames(List<Employee> employees) {
        if (employees.isEmpty()) {
            return new ArrayList<>();
        }
        List<String> list = new ArrayList<>();
        for (Employee employee : employees) {
            list.add(employee.name);
        }
        return list;
    }

    public static List<String> filterEmployeesByMinAge(List<Employee> employees, int minAge) {
        if (employees.isEmpty()) {
            return new ArrayList<>();
        }
        List<String> list = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.age >= minAge) {
                list.add(employee.name);
            }
        }
        return list;
    }

    public static boolean isAverageAgeAbove(List<Employee> employees, int minAvgAge) {
        if (employees.isEmpty()) {
            return false;
        }
        int allAge = 0;
        for (Employee employee : employees) {
            allAge += employee.age;
        }
        int avrAge = allAge / employees.size();
        return avrAge > minAvgAge;
    }

    public static Employee getYoungestEmployee(List<Employee> employees) {
        if (employees.isEmpty()) {
            return null;
        }
        Employee youngest = employees.get(0);
        for (Employee employee : employees) {
            if (employee.age < youngest.age) {
                youngest = employee;
            }
        }
        return youngest;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
