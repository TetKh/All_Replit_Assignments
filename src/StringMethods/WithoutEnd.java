package StringMethods;

public class WithoutEnd {

    public static void main(String[] args) {

        // tests
        System.out.println(withoutEnd("Hello")); // → "ell"
        System.out.println(withoutEnd("java")); // → "av"
        System.out.println(withoutEnd("coding")); // → "odin"
        System.out.println(withoutEnd("woohoo")); // → "ooho"
        System.out.println(withoutEnd("ab") ); //→ ""

    }


    public static String withoutEnd(String str) {


        // return str.replace(str.substring(0, 1), "")
               // .replace(str.substring(str.length()-1), "");

        // String withoutFirst = str.substring(1);
        // return (withoutFirst.substring(0, withoutFirst.length() - 1));

        return str.substring(1, str.length()-1);

    }
}

