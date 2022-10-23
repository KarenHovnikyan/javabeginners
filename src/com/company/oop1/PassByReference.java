package com.company.oop1;

/**
 * @author Karen
 */
public class PassByReference {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Hello");
        PassByReference p = new PassByReference();
        p.print(s);
        System.out.println(s); // Hello World

    }

    public void print(StringBuilder n) {
        n.append("World");
        System.out.println(n); // Hello World
    }

}
