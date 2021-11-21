package Loops;

public class ReverseWithKeepingChars {

    public static void main(String[] args) {

        String str = "AB,C$DS!J";
        String reverse = "";
        int length = str.length()-1;

        for (int i = 0; i < str.length(); i++){

            if(Character.isLetter(str.charAt(i))){

                for (int j = length; j >= 0; j--) {

                    if (Character.isLetter(str.charAt(j))) {

                        reverse += str.charAt(j);
                        length = j - 1;
                        break;
                    }
                }
            } else reverse += str.charAt(i);
        }

        System.out.println(reverse);

    }
}

