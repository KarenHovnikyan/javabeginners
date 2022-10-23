package com.company.oop3;

/**
 * @author Karen
 */
public class DownCastingParent {
}

class Childs extends DownCastingParent {

    public static void main(String[] args) {

        Childs c = new Childs();

        DownCastingParent p = c;

        Childs t = (Childs) p;

    }

}
