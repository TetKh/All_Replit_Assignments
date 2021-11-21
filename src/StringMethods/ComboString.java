package StringMethods;

public class ComboString {

    public static void main(String[] args) {


        System.out.println(comboString("Hello", "hi")); // → "hiHellohi"
        System.out.println(comboString("hi", "Hello")); // → "hiHellohi"
        System.out.println(comboString("aaa", "b")); // → "baaab"
        System.out.println(comboString("b", "aaa")); // → "baaab"
        System.out.println(comboString("aaa", "")); // → "aaa"
        System.out.println(comboString("", "bb")); // → "bb"


    }



    public static String comboString(String a, String b) {

        return (a.length() > b.length()) ? b + a + b : a + b + a;

    }
}

