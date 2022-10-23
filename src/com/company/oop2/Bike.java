package com.company.oop2;

/**
 * @author Karen
 */
abstract class Bike {
    abstract void run();

    public void test() {
    }
}

// Bike b = new Bike(); // DOES NOT COMPILE


abstract class Honda extends Bike {
    abstract int add();
}

class Walrus extends Honda {

    @Override
    void run() {
        System.out.println("running safely..");
    }

    @Override
    int add() {
        return 1;
    }

}
