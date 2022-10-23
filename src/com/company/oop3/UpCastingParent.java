package com.company.oop3;

/**
 * @author Karen
 */
public class UpCastingParent {

}

class Child extends UpCastingParent {

    public static void main(String[] args) {

        Child c = new Child();

        UpCastingParent a = c;

    }
}

