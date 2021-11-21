package Basics;

public class MonkeyTrouble {

    public static void main(String[] args) {

        //Uncomment below to test your method

        System.out.println(monkeyTrouble(true, true)); // true
        System.out.println(monkeyTrouble(false, false)); // true
        System.out.println(monkeyTrouble(true, false)); // false
        System.out.println(monkeyTrouble(false, true)); // false

    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

        if (aSmile && bSmile) {
            return true;
        } else if (!aSmile && !bSmile) {
            return true;
        } else
            return false;
    }
}

// The above can be shortened to:
//   return ((aSmile && bSmile) || (!aSmile && !bSmile));
// Or this very short version (think about how this is the same as the above)
//   return (aSmile == bSmile);