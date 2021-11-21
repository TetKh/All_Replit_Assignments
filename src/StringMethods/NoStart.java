package StringMethods;

public class NoStart {

    public static void main(String[] args) {
        //tests
        System.out.println(noStart("Hello", "There")); // → "ellohere"
        System.out.println(noStart("java", "code"));  // → "avaode"
        System.out.println(noStart("shotl", "java")); // → "hotlava"
        System.out.println(noStart("x", "ac")); // → "c"
        System.out.println(noStart("a", "x")); // → ""
    }

    public static String noStart(String a, String b) {

        //implement here

        return a.concat(b).replace(a.substring(0, 1), "")
                .replace(b.substring(0, 1), "");

    }

}
