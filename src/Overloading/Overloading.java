package Overloading;

public class Overloading {
    public static void main(String[] args) {
        //Create 3 overloaded versions of randomString() method that geneartes a random String and returns it
        // First method should genearte a random String of 5 lowercase charcters
        //  Second method should accept the length of the string as parameter and  genearte a random String of lowercase charcters of given length
        //  Third method should accept the length of the string and boolean parameter called isUppercase  and  genearte a random String of uppercase charcters of given length id the boolean value is true, otherwise geneartes all lowercase

        // Once you create all 3 methods, test them in the main method by passing corresponding arguments.

        System.out.println(randomString(5));
        System.out.println(randomString(5, true));
    }

    public static String randomString(){
        String str = "";
        for (int i = 0; i < 5; i++){
            char ch = (char)(97 + Math.random() * 26);
            str += ch;
        }
        return str;
    }
    public static String randomString(int a){
        String str = "";
        for (int i = 0; i < a; i++){
            char ch = (char)(97 + Math.random() * 26);
            str += ch;
        }
        return str;
    }
    public static String randomString(int a, boolean isUppercase){
        String str = "";
        for (int i = 0; i < a; i++){
            char ch = (char)(97 + Math.random() * 26);
            if (isUppercase)
                str += Character.toUpperCase(ch);
            else
                str += ch;
        }
        return str;
    }
}