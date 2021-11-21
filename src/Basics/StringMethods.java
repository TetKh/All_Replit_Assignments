package Basics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringMethods {


    public static void main(String[] args) {


//        String str;

        Scanner sc;

        // String literal

        // String is a reference type
        String str2 = new String("Hello");

        System.out.println(str2);
        System.out.println(str2);

        Math.random();

        System.out.println(str2.toUpperCase());



        String str = "Java";
        System.out.println(str.length());

        System.out.println("Hello".length());

        System.out.println("Hello world".length());

        System.out.println("  ".length());


        int l = "".length();
        System.out.println(l);



        // String class is immutable

        String str5 = "hElLo";

        System.out.println("Hello" + " hi");
        System.out.println(str5.concat(" hi"));


        System.out.println(str5.toUpperCase());

        String allLower = str5.toLowerCase();

        System.out.println(allLower);



        System.out.println(str5);

        str5 = str5.toUpperCase();

        System.out.println(str5);


        String str6 = "  Delta\tis the best group   \n \t ";
        System.out.println(str6);

        System.out.println(str6.trim());

        System.out.println(str6.
                toUpperCase().toLowerCase().trim().charAt(0));

//        char ch = 'f';
//
//        System.out.println(ch.toUpperCase());

        String st1 = "Java";
        String st2 = "Java";

        String st3 = new String("Java");

        System.out.println(st1 == st2);
        System.out.println(st1 == st3);  // never use == operator to compare Strings
        //  == operator compares the memory location
        System.out.println(st1.equals(st3)); // compares the values / content


        String st4 = "Java";
        String st5 = "java";
        System.out.println(st4.equals(st5));
        System.out.println(st4.equalsIgnoreCase(st5));

        System.out.println("Hi".compareTo("Hh"));

        System.out.println("Nazrin".startsWith("Naz"));
        System.out.println("Nazrin".endsWith("rin"));
        System.out.println("Nazrin".endsWith("")); // true

        System.out.println("Leo loves burgers".contains("love"));

        System.out.println("Leo loves burgers".contains("o lo"));

        System.out.println("Leo loves burgers"
                .toLowerCase().contains("leo love".toLowerCase()));


        String str7 = "We love Testing";

        System.out.println(str7.substring(0, 2));
        // ending index is not going to part of the new String

        System.out.println(str7.substring(3, 7));

        System.out.println(str7.substring(8));

        String str9 = "hElLo";

        System.out.println("Hello" + " hi");
        System.out.println(str9.concat(" hi"));

        String str3 = "Delta is the best group";
        // Index -> Indices in Java are zero based

        char c = str3.charAt(0);
        System.out.println(c);


        String str4 = "Alpha";

        System.out.println(str4.length()-1);
        int lastIndex = str4.length()-1;
        System.out.println(str4.charAt(lastIndex));

        System.out.println(str4.charAt(str4.length()-2));

        System.out.println(str4.charAt(0));

//       System.out.println(str4.charAt(str4.length()));

//        System.out.println(str4.charAt(-1));

        String s8 = "Rafael";
        System.out.println(s8.concat(" hi"));


        System.out.println("Hi".compareTo("Hh"));

        System.out.println("Leo loves burgers".contains("love"));
        System.out.println("Leo loves burgers"
                .toLowerCase().contains("leo love".toLowerCase()));

    }
}

