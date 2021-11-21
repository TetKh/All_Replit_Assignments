package Loops;public class StringLoops {

    public static void main(String[] args) {


        String str = "Let's go to sleep";


        for (int i = 0; i < str.length(); i++) {

            System.out.print(str.charAt(i) );



        }

        System.out.println();

        //Create a method that takes 2 Strings and prints them in mixed fashion

        // Example:  hi, yo  -> hyio
        // hello, civic -> hceilvlioc




        String str1 = printMixed("hello", "civic");

        System.out.println(str1);
    }

    public  static String printMixed(String st1, String st2){

        String str = "";

        for (int i = 0; i < st1.length(); i++) {
            str = str + st1.charAt(i);
            str += st2.charAt(i);
        }


        return str;


    }

}
