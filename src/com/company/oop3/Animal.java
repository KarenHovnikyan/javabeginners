package com.company.oop3;

/**
 * @author Karen
 */
public abstract interface Animal {
    public abstract void animalSound();
}


class Pig implements Animal {

    @Override
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }

}
