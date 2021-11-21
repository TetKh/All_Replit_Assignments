package Basics;

public class LastTwo {
    public static void main(String[] args) {
        System.out.println(right2("Hello")); // "loHel"
        System.out.println(right2("java")); // "vaja"
        System.out.println(right2("Hi")); // "Hi"

    }
    public static String right2(String word) {

        //Create your method here

        String lastTwo = word.substring(word.length()-2);

        return lastTwo + word.substring(0, word.length()-2);
    }
}
