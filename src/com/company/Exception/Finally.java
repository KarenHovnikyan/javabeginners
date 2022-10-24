package com.company.Exception;

/**
 * @author Karen
 */
public class Finally {


    public static void main(String args[]) {

        try {
            int data = 25 / 5;
            System.out.println(data);
            return;
        } catch (NullPointerException e) {
            System.out.println(e);
        } finally {
            System.out.println("finally block is always executed");
        }

        System.out.println("rest of phe code...");
    }

}
