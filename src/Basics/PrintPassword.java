package Basics;

public class PrintPassword {

    public static void main(String[] args) {

        String word = "Hello";
        byte b = 34;
        long l = 31254L;
        float f = 56.7F;
        char ch = '&';
        boolean boo = true;
        int i = 3256;
        char dol = '$';

        printPassword("Hello", (byte)34, 31254L, 56.7F, '&', true, 'a', '$');

    }

    public static void printPassword(String word, byte b, long l, float f, char ch, boolean boo, int i, char dol)
     {
         System.out.println(word + b + l + f + ch + boo + i + dol);





    }
}
