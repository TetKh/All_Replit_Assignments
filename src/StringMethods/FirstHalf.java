package StringMethods;

public class FirstHalf {
    public static void main(String[] args) {

        //tests
        System.out.println(firstHalf("WooHoo")); // → "Woo"
        System.out.println(firstHalf("HelloThere")); // → "Hello"
        System.out.println(firstHalf("abcdef"));  // → "abc"
        System.out.println( firstHalf("ab") ); //→ "a"
        System.out.println(firstHalf("") ); //→ ""
    }


    public static String firstHalf(String str) {
        //implement here

        int num = str.length();
        int halfNum = num / 2;
        return str.substring(0, halfNum);

    }

}
