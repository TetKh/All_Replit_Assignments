package StringMethods;

public class LastTwo {

    public static void main(String[] args) {

        // tests
        System.out.println(left2("Hello")); // → "lloHe"
        System.out.println(left2("java")); // → "vaja"
        System.out.println(left2("Hi"));// → "Hi"
        System.out.println(left2("code")); //  → "deco"
        System.out.println(left2("cat")); // → "tca"
        System.out.println(left2("12345")); // → "34512"
    }


    public static String left2(String str) {

        String first2 = str.substring(0, 2);

        return str.replace(first2, "") + first2;
    }

}
