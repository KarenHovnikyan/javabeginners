package com.company.strings;

/**
 * @author Karen
 */
public class Strings {
    public static void main(String[] args) {

        Strings st = new Strings();

        st.tabLiterals("sdkjflkdjs " +
                "askjdkaj asdkfjas asldj a  asd sdfs    asdasd  ");

        String result = st.strRevers("abcde");
        System.out.println(result);
    }

    /**
     * Write a method that takes a String parameter and prints each empty
     * character on a new line using a String Literal ( \t, \b ....):.
     *
     * @param str
     */
    void tabLiterals(String str) {
        String[] strSplit = str.split("[\t,\b,\n,\r, ' ']");

        for (String index : strSplit) {
            System.out.println(index);
        }
    }

    /**
     * Write a method (reverse) that reverses String.
     *
     * @param str
     * @return strResult
     */
    String strRevers(String str) {
        char[] ch = str.toCharArray();
        String strReverse = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            strReverse += ch[i];
        }
        return strReverse;
    }

    /**
     * Write a method that checks how many times the token substring is found in the given text.
     *
     * @param line
     * @param token
     * @return count
     */
    int countSubString(String line, String token) {
        int count = 0;
        for (int i = 0; i < line.length(); i++) {

        }

        return count;
    }

}
