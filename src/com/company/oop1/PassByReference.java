package com.company.oop1;

/**
 * @author Karen
 */
public class PassByReference {

    public void print(StringBuilder n) {
        n.append("World");
        System.out.println(n); // Hello World
    }
}
