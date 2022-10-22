package com.company.simple_class;

import java.util.Objects;

/**
 * @author Karen
 */
public class Employee {
    private int id;
    private String name;
    private String department;
    private int age;
    private String gender;

    public Employee(int id, int age, String name, String department, String gender) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.department = department;
        this.gender = gender;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee(1, 20, "mile", "N4", "Aram");
        Employee employee2 = new Employee(3, 20, "mile", "N4", "Arshak");
        Employee employee3 = new Employee(4, 25, "female", "N3", "Lili");

        System.out.println(employee1.toString());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && age == employee.age && name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }
}
