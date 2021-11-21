package StringMethods;

public class WithoutEnd2 {

    public static void main(String[] args) {
        //tests
        System.out.println(withoutEnd2("Hello")); //→ "ell"
        System.out.println(withoutEnd2("abc")); // → "b"
        System.out.println(withoutEnd2("ab")); // → ""
        System.out.println(withoutEnd2("a")); //→ ""
        System.out.println(withoutEnd2("")); // → ""
    }


    public static String withoutEnd2(String str) {
        return (str.length() < 3) ? "" : str.substring(1, str.length() - 1);

    }
}