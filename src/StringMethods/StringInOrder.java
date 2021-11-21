package StringMethods;

public class StringInOrder {

    public static void main(String[] args) {

        System.out.println(stringInOrder("abc")); // true
        System.out.println(stringInOrder("edabit")); // false
        System.out.println(stringInOrder("123")); // true
        System.out.println(stringInOrder("xyzz")); // true


    }

    public static boolean stringInOrder(String word) {

        return (word.charAt(0) <= word.charAt(1)) && (word.charAt(1) <= word.charAt(2)) &&
                (word.charAt(2) <= word.charAt(3)) && (word.charAt(3) <= word.charAt(4)) &&
                (word.charAt(4) <= word.charAt(5)) && (word.charAt(5) <= word.charAt(6));
    }
}
