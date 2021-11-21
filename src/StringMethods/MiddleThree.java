package StringMethods;

public class MiddleThree {

    public static void main(String[] args) {
        //tests
        System.out.println(middleThree("Candy")); // → "and"
        System.out.println(middleThree("and") ); //→ "and"
        System.out.println(middleThree("solving")); // → "lvi"
        System.out.println(middleThree("Chocolate")); // → "col"
        System.out.println(middleThree("java yet java")); // → "yet"

    }

    public static String middleThree(String str) {
        //implement here

        int num = str.length();
        int half = num / 2;

        return str.substring(half-1, half+2);

    }
}
