package com.company.operators;

/**
 * @author Karen
 */
public class Operators {
    public static void main(String[] args) {

        Operators operators = new Operators();
        operators.swap(4, 7);

        int result = operators.multiplicateShift(10);
        System.out.println(result);
    }

    /**
     * Declare two int type variables, assign 10 and 5 and then change the values of the variable by places.
     *
     * @param x
     * @param y
     */
    void swap(int x, int y) {
        x = x + y;
        y = x - y;
        x = x - y;
    }

    /**
     * Multiply the given variable by 16 without using the * sign.
     *
     * @param x
     * @return x * 16
     */

    int multiplicateShift(int x) {
        int result = x << 4;
        return result;
    }
}
