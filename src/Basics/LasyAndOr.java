package Basics;

public class LasyAndOr {


        public static void main(String[] args) {


            // &&
            System.out.println(false && true); // false !=
            System.out.println(true && true); // true +
            System.out.println(false && false); // false +
            // ||
            System.out.println(false || true); // true !=
            System.out.println(true || true); // true +
            System.out.println(false || false); // false +
            // ^
            System.out.println(false ^ true); // true +
            System.out.println(true ^ true); // false +

            System.out.println(false || true && (true ^  (true ^ true))); // true




        }
    }
