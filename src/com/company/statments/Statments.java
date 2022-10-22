package com.company.statments;

/**
 * @author Karen
 */
public class Statments {
    public static void main(String[] args) {
        Statments statments = new Statments();
        boolean t = statments.threeDigitNumber(994);
        System.out.println(t);

        boolean t1 = statments.cordinatesRegion(4, 5, 8, 9);
        System.out.println(t1);

        boolean t2 = statments.leapYear(1700);
        System.out.println(t2);


        int result = statments.sumDigitNumbers(1234);
        System.out.println(result);
    }

    /**
     * Write a method that checks whether the second digit of a given three-digit number is 7 or not.
     * For example. 974 -> true, 846 -> false
     *
     * @param n
     * @return true or false
     */
    boolean threeDigitNumber(int n) {

        return n / 10 % 10 == 7 ? true : false;
    }

    /**
     * Write a method that checks whether the point with (x,y) coordinates is in the region K(0,5) or not.
     *
     * @param x
     * @param y
     * @param x1
     * @param y1
     * @return true or false
     */
    boolean cordinatesRegion(int x, int y, int x1, int y1) {
        double r = Math.sqrt(x1 * x1 + y1 * y1);
        if (((x - x1) * (x - x1) + (y - y1) * (y - y1)) < r * r) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Write a method that checks whether the given year is considered a leap year.
     * A year that is divisible by 4 and 400 but not divisible by 100 is considered a leap year
     *
     * @param n
     * @return true or false
     */
    boolean leapYear(int n) {
        if ((n % 100 != 0 && n % 4 == 0) || n % 400 == 0) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * Write a method that receives a 5-digit integer and calculates the sum of the digits of that number.
     *
     * @param n
     * @return dijits of that number
     */

    int sumDigitNumbers(int n) {
        int sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n /= 10;
        }
        return sum;
    }


}
