package com.company.primitive_data_type;

import java.util.Scanner;

/**
 * @author Karen
 */
public class PrimitiveDataTypes {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        PrimitiveDataTypes pdt = new PrimitiveDataTypes();
        int a = myObj.nextInt();
        int b = myObj.nextInt();
        pdt.print((byte) a, (byte) b);

        System.out.println(Integer.MAX_VALUE);
    }

    /**
     * Create 2 variables assign arbitrary values and print to the console:
     *
     * @param a
     * @param b
     */
    void print(byte a, byte b) {
        System.out.println(a);
        System.out.println(b);
    }


    /**
     * Print byte, short, int and long Max & Min values;
     */
    void printMaxMinValues() {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
    }


    /**
     * Assign the value 9 to char t
     */
    void charSimbhole() {
        char t = 0x0009;
        System.out.println(t);
    }


    /**
     * Narrowing casting must be done manually by placing the type
     * in parentheses in front of the value;
     */
    void narrowingCasting() {
        double dd = 15.6d;
        int ii;

        ii = (int) dd;
    }

}
