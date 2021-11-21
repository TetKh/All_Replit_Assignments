package Loops;

public class PolindromeWords2 {

    public static void main(String[] args) {

        System.out.println(isPalindrome("civic")); // true
        System.out.println(isPalindrome("Racecar")); // true
        System.out.println(isPalindrome("somestring")); //false
        System.out.println(isPalindrome("java")); // false
        System.out.println(isPalindrome("TENet")); //true
        System.out.println(isPalindrome("t")); // true
        System.out.println(isPalindrome("sS")); // true

    }

    //Don't change the method header
    public static boolean isPalindrome(String str) {

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);

        }
        if (str.toLowerCase().equals(reverse.toLowerCase())) {
            return true;
        }
        return false;
    }
}