package com.company.oop1;

/**
 * @author Karen
 */
public class PassByReference {
    public static void main(String[] args) {

    }

    public void print(StringBuilder n) {
        n.append("World");
        System.out.println(n); // Hello World
    }
}
