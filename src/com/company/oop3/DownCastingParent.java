package com.company.oop3;

/**
 * @author Karen
 */
public class DownCastingParent {
}

class Child extends DownCastingParent {

    public static void main(String[] args) {

        Child c = new Child();

        DownCastingParent p = c;

        Child t = (Child) p;

    }

}
