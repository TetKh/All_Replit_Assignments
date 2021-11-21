package Array;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        System.out.println(isAnagram("abc", "cdb"));
        System.out.println(isAnagram("bored","robed"));
        System.out.println(isAnagram("cola","loco"));
    }


    public static boolean isAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }
        char[] a1 = str1.toCharArray();
        char[] a2 = str2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);
    }
}
/*
        String [] a1 = str1.split("");
        String [] a2 = str2.split("");
 */