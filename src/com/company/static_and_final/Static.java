package com.company.static_and_final;

/**
 * @author Karen
 */
public class Static {
    static {
        System.out.println("Hello");
    }

    static {
        System.out.println("Executes First");
    }

    static {
        System.out.println("Executes Second");
    }

    int i = 10;

    {
        System.out.print(i);
    }

    public static void main(String[] args) {
        System.out.println("Hi folks");
    }


}
