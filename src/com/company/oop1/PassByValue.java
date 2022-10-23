package com.company.oop1;

/**
 * @author Karen
 */
public class PassByValue {
    public static void main(String[] args) {
        int a = 0;
        PassByValue p = new PassByValue();
        p.print(a);
        System.out.println(a); // 0

    }


    public void print(int i) {
        i += 5;
        System.out.println(i); //5
    }

}
