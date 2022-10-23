package com.company.oop2;

/**
 * @author Karen
 */
public class Overloading {


    public Overloading() {
    } // default constructor


    //differ by the number of input parameters
    public Overloading(int a) {
    }


    //differ by the type of input parameters
    public Overloading(float a) {
    }


    //calls another constructor
    public Overloading(String b) {
        this(8);
    }

    public static void main(String[] args) {
        Overloading overloading = new Overloading();
        int[] x = {1, 2, 3, 4};
        overloading.add(x);

    }

    void add(int a) {
    }   //1. Exact match by type

    void add(double a) {
    }  //2. Larger primitive type

    void add(Integer a) {
    }  //3. Autoboxed type

    void add(int... a) {
    }  //4.  Varargs

}
