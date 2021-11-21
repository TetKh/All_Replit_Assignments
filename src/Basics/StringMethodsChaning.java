package Basics;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class StringMethodsChaning {

    public static void main(String[] args) {



        String a = "abc";
        String b = a.toUpperCase();
        b = b.replace("B", "2")
                .replace('C', '3')
                .replace("A", "z");
        System.out.println("a = " + a); // a = abc
        System.out.println("b = " + b); // b = z23

        System.out.println(theEnd("Hello", true));
        System.out.println(theEnd("Hello", false));
        /*
        Given a string, return a string length 1 from its front,
        unless front is false, in which case return a string length 1 from its back.
        The string will be non-empty.
        theEnd("Hello", true) → "H"
        theEnd("Hello", false) → "o"
        theEnd("oh", true) → "o"
         */

    }


        public static String theEnd(String str, boolean front) {

            if (front) {
                return str.substring(0, 1);

            } else {
                return str.substring(str.length()-1);

        }



    }
}
