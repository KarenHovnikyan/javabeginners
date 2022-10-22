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


        int count = st.countSubString("iw w w wi", "w");
        System.out.println(count);

        StringBuilder sts = new StringBuilder("avs");
        System.out.println(sts.toString().toUpperCase());

        st.print20Symbols("Kinomateria");

        System.out.println("karin benzeman".replace('a', ' '));

        String str = st.removeA("ameno ameno ameno amenoa", 'a');
        System.out.println(str);

        System.out.println("minasian nilta".substring(0, 7));

        st.isEmptyStr("");

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
        String[] str = line.split(token);
        int count = str.length;
        if (line.endsWith(token)) {
            count++;
        }
        return count - 1;
    }

    /**
     * Write a method that reads a line of 20 characters from the console, prints it,
     * if the length of the line is less than 20,then we must
     * silence the line by writing the symbol "*" instead of less characters.
     *
     * @param str
     */
    void print20Symbols(String str) {
        System.out.println(str);
        while (str.length() < 20) {
            str += "*";
        }
        System.out.println(str);
    }

    /**
     * Write a method that removes all "a" characters from the given text.
     *
     * @param str
     * @param a
     * @return newStr
     */
    String removeA(String str, char a) {
        String newStr = new String();
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != a) {
                newStr += ch[i];
            }
        }
        return newStr;
    }


    /**
     * Write a method that checks if the given String parameter is empty and not null:
     *
     * @param str
     */

    void isEmptyStr(String str) {
        if (str.isEmpty()) {
            System.out.println("str isEmpty");
        }
        if (str == null) {
            System.out.println("str is a null");
        } else {
            System.out.println("str is a not null and not Empty");
        }
    }

}
