package Loops;

public class Palindrome {

    public static void main(String[] args) {

        // mom, dad, racecar, civic


        String str = "civiC";


        // boolean flag

        boolean isPalindrome = true;

        for ( int i = 0, j = str.length()-1; i<j ; i++, j--) {   //i<str.length()/2

            if (str.charAt(i) != str.charAt(j)) {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println("It is a palindrome");
        }else {
            System.out.println("Not a palindrome");
        }
    }
}
