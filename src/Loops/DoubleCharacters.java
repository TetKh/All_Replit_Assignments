package Loops;

public class DoubleCharacters {

    public static void main(String[] args) {

        String str1 = doubleChar("hello world");

        System.out.println(str1);
    }

    public static String doubleChar(String st1) {

        String str = "";

        for (int i = 0; i < st1.length(); i++) {
            str = str + st1.charAt(i) + st1.charAt(i);
        }


        return str;
    }
}

