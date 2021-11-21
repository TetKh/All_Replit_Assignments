package Loops;

public class CharacterClass {
    public static void main(String[] args) {


        //   Wrapper class -> Class versions of primitive data types

        // int -> Integer
//
//        Integer i = 90;
//        int i1 = 90;
//
//       int i3 =  Integer.parseInt("90");

        System.out.println(Character.isDigit('5'));
        System.out.println(Character.isLetter('5'));

        String str = "dhRRRv%2&3b232b23****@";
        // find the count of numeric chars

        int countNum = 0;
        int countLetter = 0;
        int countNumOrLetter = 0;

        int countUpper = 0;
        int countLower = 0;

        char u = Character.toLowerCase('U');

        System.out.println(u);

        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                System.out.print(str.charAt(i) + " ");
                countNum++;
            }

            if(Character.isLetter(str.charAt(i))){

                countLetter++;
            }

            if(Character.isLetterOrDigit(str.charAt(i))){

                countNumOrLetter++;
            }

            if(Character.isUpperCase(str.charAt(i))){

                countUpper++;
            }

            if(Character.isLowerCase(str.charAt(i))){

                countLower++;
            }
        }
        System.out.println();
        System.out.println("The count of numeric chars: " + countNum);
        System.out.println("The count of letters: " + countLetter);
        System.out.println("The count of letters or numeric chars: " + countNumOrLetter);
        System.out.println("The count of Uppercase chars: " + countUpper);
        System.out.println("The count of lowercase chars: " + countLower);


        String str1 =   Character.toString('s').toUpperCase();

        System.out.println((int)Character.MAX_VALUE);
        System.out.println((int)Character.MIN_VALUE);

        System.out.println(Character.isWhitespace('\t'));



    }
}
