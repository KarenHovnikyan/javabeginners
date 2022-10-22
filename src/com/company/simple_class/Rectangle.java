package com.company.simple_class;

/**
 * @author Karen
 */
public class Rectangle {
    public int length;
    public int width;

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.length = 5;
        rectangle.width = 14;
        int result = rectangle.calculateArea();
        System.out.println(result);
    }

    /**
     * Multiplicate length and width
     *
     * @return length * width
     */
    int calculateArea() {
        return length * width;
    }
}
