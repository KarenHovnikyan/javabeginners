package com.company.oop1;

/**
 * @author Karen
 */
public class Test {
    public static void main(String args[]) {
        Person person = new Person();
        //person.name = "Hanna";
        //person.age = -8;//DOES NOT COMPILE
        person.setName("Lolo");
        person.setAge(10);

        System.out.println(person.getAge());
        System.out.println(person.getName());
    }

}
