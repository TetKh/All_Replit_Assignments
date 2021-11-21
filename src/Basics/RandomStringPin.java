package Basics;

import java.util.Locale;

public class RandomStringPin {

    public static void main(String[] args) {

        String s = "abcdefghijklmnopqrstuvwxyz0123456789";
        String id = "";
        for (int i = 0; i < 10; i++) {
            id += s.charAt((int) (Math.random() * s.length()));
        }
        System.out.println(id);


        String id2 = "";
        for (int i = 0; i < 10; i++) {
            id2 += (char)(94 + (Math.random() * 25));
        }
        System.out.println(id2);


        String id3 = "";
        for (int i = 0; i < 10; i++) {
            id3 += (int)(1 + (Math.random() * 9));
        }
        System.out.println(id3);


        //String id4 = "";
        //for (int i = 0; i < 10; i++) {
            int a = (int)(100 + (Math.random() * 900));

        System.out.println(a);

        String a1 = "Rafael";
        System.out.println(a1.substring(a1.length()-1).toUpperCase());


    }
}

