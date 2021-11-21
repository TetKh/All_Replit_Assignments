package RegularExpressions;

public class PhoneNum {

        public static void main(String[] args) {
            // Create  a method that checks if a passed String matches the correct format for a US phone number.
            // Phone number can't start with zero
            //  202-997-0899  -> true
            //  056-342-2234  -> false
            //  99798456-78956 -> false
            //  231-4562-21 -> false

            System.out.println(phoneNum("202-997-0899"));
            System.out.println(phoneNum("002-997-0899"));
            System.out.println(phoneNum("3044-997-0899"));

            System.out.println(serialNum("saDs%#@-997-HDHS"));

            System.out.println(username("Asbmd.ssfsd42b"));

            // regex for username:
            // Start with uppercase
            // At least 8 characters, at most 20 characters
            // Only letters and numbers and period allowed

        }

        public static boolean phoneNum(String b){

            return b.matches("[1-9][0-9]{2}-[\\d]{3}-[\\d]{4}");

        }

        public static boolean serialNum(String b){
            return b.matches("[a-zA-Z%&#@_.-]{7}-[0-9]{3}-[A-Z]{4}");
        }

        public static boolean username(String b){
            return b.matches("[A-Z][a-z.0-9]{7,19}");
        }

    }