package com.company.static_and_final;

/**
 * @author Karen
 */
public class Final {
    final int m = 77;
    final int k;
    final int v;

    {
        k = 10; // Initialize in instance block
    }

    public Final(int a) {
        v = a; // Initialize in constructor block
    }

    public void add(final char c) {
        final int i = 80;

        //  i = 10;   //DOES NOT COMPILE
        // k = 10;   //DOES NOT COMPILE
        //  c = ‘f’;  //DOES NOT COMPILE
    }

    public void add() {
        final int i;// Initialize for locals is anywhere inside method
        i = 10;
        //  i = 11;//DOES NOT COMPILE

        //  k = 10;//DOES NOT COMPILE
    }


}
