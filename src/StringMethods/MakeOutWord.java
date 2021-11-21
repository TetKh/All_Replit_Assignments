package StringMethods;

public class MakeOutWord {

    public static void main(String[] args) {

        // test here
        System.out.println(makeOutWord("<<>>", "Yay"));   //→ "<<Yay>>"
        System.out.println(makeOutWord("<<>>", "WooHoo"));  //→ "<<WooHoo>>"
        System.out.println(makeOutWord("[[]]", "word")) ; // → "[[word]]"
        System.out.println(makeOutWord("HHoo", "Hello")); // → "HHHellooo"
        System.out.println(makeOutWord("abyz", "YAY")); // → "abYAYyz"

    }


    public static String makeOutWord(String out, String word) {
        // implement here

        String firstElements = out.substring(0, 2);
        String lastElements = out.substring(2, 4);

        return firstElements + word + lastElements;
    }
}
