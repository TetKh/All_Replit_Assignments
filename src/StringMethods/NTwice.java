package StringMethods;

public class NTwice {

    public static void main(String[] args) {
        //tests

        System.out.println(nTwice("Hello", 2)); // → "Helo"
        System.out.println(nTwice("Chocolate", 3)); // → "Choate"
        System.out.println(nTwice("Chocolate", 1)); // → "Ce"
        System.out.println(nTwice("Chocolate", 0)); // → ""
        System.out.println(nTwice("Hello", 4)); // → "Hellello"
        System.out.println(nTwice("Code", 4)); // → "CodeCode"
        System.out.println(nTwice("Code", 2)); // → "Code"
    }


    public static String nTwice(String str, int n) {

        String firstN = str.substring(0, n);
        String lastN = str.substring(str.length()-n);

        return lastN;
    }

}

