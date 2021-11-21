package InterviewCodingTasks;

import java.util.*;

public class String_AZBalance {

//    Write a Java program to check whether a string is az-balanced or not.
//    - At list one 'z' must exist after last 'a'
//    - At list one 'a' must exist before 'z'
//    - Do not use any String methods such as lastIndexOf()

//    Input:    --->    Output:
//    "aaaz"    --->    true
//    "aaaza"   --->    false
//    "aaazaz"  --->    true
//    "bbbz"    --->    false

    public static void main(String[] args) {

        String str1 = "asdsdaeretajgkdlrzpfgkdf";

        System.out.println(azBalanceString(str1));
        System.out.println(method2(str1));

    }


    public static boolean azBalanceString(String str) {
        Boolean a = false;
        Boolean z = false;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'a') {
                a = true;
            }

            if (str.charAt(i) == 'a' && z == true) {
                a = true;
                z = false;
            }

            if (str.charAt(i) == 'z' && a == true) {
                z = true;
            }

        }

        if (a == false)
            z = false;
        return z;
    }


    public static boolean method2(String str) {
        if (!str.contains("a")){
            return false;
        }
        int lastIndex = str.lastIndexOf('a');
        for (int i = lastIndex + 1; i < str.length(); i++) {
            if(str.charAt(i) == 'z'){
                return true;
            }
        }
        return false;
    }


}
