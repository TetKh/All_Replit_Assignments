package StringMethods;

import java.util.ArrayList;
import java.util.List;

public class ReversedStringUnicode {
    public static void main(String[] args) {
        String str = "Hello";
        // string is immutable
//        System.out.println("\u202E" + str);
        System.out.println(reverseString(str));
    }
    // Method to reverse a string in Java by Unicode
    // Right-to-left Override (RLO) character
    public static String reverseString(String str) {
        return "\u202E" + str;
    }

}

