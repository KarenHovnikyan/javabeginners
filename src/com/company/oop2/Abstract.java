package com.company.oop2;

/**
 * @author Karen
 */
public abstract class Abstract {
    abstract void run();
}

class Daughter extends Abstract {
    @Override
    void run() {
        System.out.println("Daughter -> Abstract");
    }
}

// class  DaughterTwo extends Abstract { }


