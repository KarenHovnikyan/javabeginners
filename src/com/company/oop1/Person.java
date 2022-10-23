package com.company.oop1;

/**
 * @author Karen
 */
public class Person {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge > 0) {
            age = newAge;
        }
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
}