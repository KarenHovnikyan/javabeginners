package com.company.Exception;

/**
 * @author Karen
 */

class MainException extends Exception {
}


public class CustomException {

    public static void main(String args[]) {

        try {
            throw new MainException();
        } catch (MainException ex) {
            System.out.println("Caught the exception");
            System.out.println(ex.getMessage());
        }

        System.out.println("rest of the code...");
    }
}
