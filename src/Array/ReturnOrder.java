package Array;

import java.util.Arrays;

public class ReturnOrder {
    public static void main(String[] args) {

        reverseWordOrder("Hello World");

    }


    public static void reverseWordOrder(String str) {

        String[] words = str.split(" ");

        String rev = "";

        for (int i = words.length - 1; i >= 0; i--) {
            rev = rev + words[i] + " ";

        }
        System.out.println(rev);

    }
}
/*
for(int i = 0, j = s.length - 1 ; i <= j ; i++, j--){
              String temp =  s[i];
              s[i] = s[j];
              s[j] = temp;
    }
     return String.join("$", s);
  }
}
 */