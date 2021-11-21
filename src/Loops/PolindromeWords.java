package Loops;

public class PolindromeWords {

    public static void main(String[] args) {
        // Run unit tests to test your method
        System.out.println(isPalindrome("civic")); // true
        System.out.println(isPalindrome("Racecar")); // true
        System.out.println(isPalindrome("somestring")); //false
        System.out.println(isPalindrome("java")); // false
        System.out.println(isPalindrome("TENet")); //true
        System.out.println(isPalindrome("t")); // true
        System.out.println(isPalindrome("sS")); // true

    }

    //Don't change the method header
    public static boolean isPalindrome(String str){

        // implement here
        int i = 0, j = str.length() - 1;

// While there are characters to compare
        while (i < j) {

            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;

            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }

        // Given string is a palindrome
        return true;
    }


}
