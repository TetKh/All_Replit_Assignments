package StringMethods;

public class ReversedStringRecursion {

    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(reverseString(str));
        System.out.println(reverseString2(str));

    }

    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static String reverseString2(String str){
        String newStr = "";
        for (int i = str.length()-1; i >= 0; i--) {
            newStr += str.charAt(i);
        }
        return newStr;
    }

}
