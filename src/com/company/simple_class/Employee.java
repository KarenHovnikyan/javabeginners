package com.company.simple_class;

/**
 * @author Karen
 */
public class Employee {
    private int id;
    private String name;
    private String department;
    private int age;
    private String gender;

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.id = 1;
        employee1.age = 20;
        employee1.gender = "mile";
        employee1.department = "N4";
        employee1.name = "Avik";

        Employee employee2 = new Employee();
        employee2.id = 3;
        employee2.age = 20;
        employee2.gender = "mile";
        employee2.department = "N4";
        employee2.name = "Avik";

        Employee employee3 = new Employee();
        employee3.id = 4;
        employee3.age = 25;
        employee3.gender = "mile";
        employee3.department = "N7";
        employee3.name = "Ani";

    }

    /**
     * Print information about Employee
     */
    void print() {
        System.out.println("ID = " + id);
        System.out.println("Name = " + name);
        System.out.println("Department = " + department);
        System.out.println("Age = " + age);
        System.out.println("Gender = " + gender);

    }

}
