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


        int a = 0;
        PassByValue p = new PassByValue();
        p.print(a);
        System.out.println(a); // 0


        StringBuilder str = new StringBuilder("Hello");
        PassByReference passByReference = new PassByReference();
        passByReference.print(str);
        System.out.println(str); // Hello World
    }

}
