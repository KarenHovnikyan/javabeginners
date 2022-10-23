package com.company.oop1;

/**
 * @author Karen
 */
public class PassByValue {
    public static void main(String[] args) {
        int a = 0;
        //print(a);
        System.out.print(a); // 0

    }


    public void print(int i) {
        i += 5;
        System.out.print(i); //5
    }

}
