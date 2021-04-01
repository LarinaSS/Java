package com.company;

import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        SortedSet<Employee> set = new TreeSet<>();
        set.add(new Employee("Name1", 34));
        set.add(new Employee("Name5", 12));
        set.add(new Employee("Name4", 11));
        set.add(new Employee("Name3", 22));
        set.add(new Employee("Name2", 12));
        System.out.println(set);
    }
}

class Employee implements Comparable<Employee> {
    String name;
    Integer salary;

    public Employee(String name, Integer salary) {
        this.name = name;
        this.salary = salary;
    }

   @Override
    public String toString() {
        return name + " - " + salary + "\n";
    }

    @Override
    public int compareTo(Employee employee) {
        int result = this.salary.compareTo(employee.salary);
        if (result == 0) {
            result = this.name.compareTo(employee.name);
        }
        return result;
    }
}
