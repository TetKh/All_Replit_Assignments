package Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class RemoveNonNumeric {

    static class Main {


        public static void main(String[] args) {

            List<Character> list = new ArrayList<>();
            list.add('a');
            list.add('$');
            list.add('w');
            list.add('5');
            list.add('@');
            list.add('z');
            list.add('#');
            list.add('$');


            removeNonAlphaNumeric(list);
            System.out.println(list);  // [a, w, 5, z]

        }

        public static void removeNonAlphaNumeric(List<Character> list) {

            for (int i = 0; i < list.size(); i++) {

                if (list.get(i).toString().matches("[^a-zA-Z0-9]")) {
                    list.remove(i);
                    i--;

                }
            }
            System.out.println(list);

        }
    }
    }
/*
public static void removeNonAlphaNumeric(Collection.List<Character> list){

    for(int i = 0; i < list.size(); i++){

      int c = (int)list.get(i);

      if(!(((c >= 48)&&(c <=57))||((c>= 65)&&(c<=90))||((c>=97)&&(c<=122)))){
        list.remove(i);
        i --;

      }
    }

  }
}


public static void removeNonAlphaNumeric(Collection.List<Character> list) {
    for (int i = 0; i < list.size(); i++) {
      if (!Character.isLetterOrDigit(list.get(i))) {
        list.remove(i);
        i = -1;
      }
    }
  }
  // With removeIf() method that uses lambda expression
  //list.removeIf(s -> !Character.isLetterOrDigit(s));
}

 */
