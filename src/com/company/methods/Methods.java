package com.company.methods;


/**
 * @author Karen
 */
public class Methods {

    public static void main(String[] args) {
        Methods methods = new Methods();

        methods.return0(40, 50);
        float f = methods.floatOneParametrs(5.6f, 9.4f);
        methods.recursion();

    }

    /**
     * Write a method which  .has two input parameters  type  int and return 0.
     *
     * @param a
     * @param b
     * @return 0
     */
    int return0(int a, int b) {
        return 0;
    }

    /**
     * Write a method which  .has  two float input parameters  and return  one of them.
     *
     * @param a
     * @param b
     * @return a  or b
     */
    float floatOneParametrs(float a, float b) {
        return a;
    }

    /**
     * Write a method which  .has  two float input parameters  and return  one of them.
     */
    void recursion() {
        recursion();
    }

}
