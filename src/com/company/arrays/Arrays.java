package com.company.arrays;

/**
 * @author Karen
 */
public class Arrays {
    public static void main(String[] args) {

        Arrays arrays = new Arrays();
        arrays.reverseArray(new short[]{1, 2, 3, 4, 5, 6,});

        arrays.minArrayElement(new float[]{1.0001f, 9.4f, 5, 7, 1.01f});

    }

    /**
     * Write a method that prints the elements of the short[] s array in reverse order
     *
     * @param number []
     */
    void reverseArray(short[] number) {
        for (int i = number.length; i > 0; i--) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    /**
     * Write a method that finds and prints the smallest element of the float[] f array:
     *
     * @param elem []
     */
    void minArrayElement(float[] elem) {
        float indexOne = elem[0];
        for (int i = 1; i < elem.length; i++) {
            if (indexOne > elem[i]) {
                indexOne = elem[i];
            }
        }
        System.out.println(indexOne);
    }

    /**
     * Write a method that counts how many times the number k is found in the elements of the array.
     *
     * @param array []
     * @param k
     * @return count K
     */
    int countK(int[] array, int k) {
        int countK = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == k) countK++;
        }
        return countK;
    }

    /**
     * Write a method that prints all non-repeating triples into an array.
     * The order of the numbers in the triples is not important.
     *
     * @param elem []
     */
    void allTriplesElem(int[] elem) {
        for (int i = 0; i < elem.length; i++) {

        }
    }
}
