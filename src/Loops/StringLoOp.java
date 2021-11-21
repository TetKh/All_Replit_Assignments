package Loops;

public class StringLoOp {

    public static void main(String[] args) {

        System.out.println(alternative("powerful"));
    }

    public static String alternative(String str){

        String st = "";

        for (int i = 0; i < str.length(); i++) {
            // char ch = str.charAt(i);
            // st = st + str.charAt(i);

            if (i % 2 == 0) {
                st = st + Character.toLowerCase(str.charAt(i));
            } else {
                st = st + Character.toUpperCase(str.charAt(i));
            }
        }
        return st;
    }

}


