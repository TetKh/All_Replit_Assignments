package Loops;

public class ReverseString {

    public static void main(String[] args) {

        System.out.println(reverse("Hello"));
        System.out.println(reverse("Programming isn't about what you know; it's about what you can figure out."));
        System.out.println(reverse(""));
        System.out.println(reverse(null));

    }

    public static String reverse(String str) {

        if (str == null) {
            return "";
        }
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result = result + str.charAt(i);

            }
        return result;

    }
}