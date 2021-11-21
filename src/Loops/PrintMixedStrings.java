package Loops;

public class PrintMixedStrings {
    public static void main(String[] args) {

        String str1 = printMixed("hello", "civic");

        System.out.println(str1);
    }

    public static String printMixed(String st1, String st2) {

        String str = "";

        for (int i = 0; i < st1.length(); i++) {
            str = str + st1.charAt(i) + st2.charAt(i);
        }


        return str;
    }
}
