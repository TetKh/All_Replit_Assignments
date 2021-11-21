package Loops;

public class IsCorrect {

    public static void main(String[] args) {

        System.out.println(isCorrect("vg2dvsavgdsvasgav3"));// true
        System.out.println(isCorrect("vgdv")); // false
        System.out.println(isCorrect("vgdvhsagdsaghdgssa")); // false
        System.out.println(isCorrect("vgdvb45362")); // true
        System.out.println(isCorrect("vgashdhasdavhsa45$")); // false
        System.out.println(isCorrect("vgdv32")); // false
    }


    public static boolean isCorrect(String str){


        int count = 0;
        int countNotValid = 0;

        for (int i = 0; i < str.length(); i++) {

        if (Character.isDigit(str.charAt(i))) {
            count++;

        } else if (!Character.isLetterOrDigit(str.charAt(i))) {
            countNotValid++;
        }
        }

        return (str.length() >= 8) && (count >= 2) && (countNotValid < 1);
    }
}