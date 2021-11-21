package Array;

public class SortString {

    public static void main(String[] args) {

        System.out.println(sortString("helloworld")); //dehllloorw
        System.out.println(sortString("javascript"));  //aacijprstv
        System.out.println(sortString("algorithm"));  //aghilmort
        System.out.println(sortString("barack"));  //aabckr
        System.out.println(sortString("parviz")); //aiprvz
        System.out.println(sortString("stamlo")); // almost
    }


    public static String sortString(String str){
        //implement
        String [] letter = str.split("");

        for (int i = 0; i < letter.length - 1; i++) {
            for (int j = i + 1; j < letter.length; j++) {

                if (letter[i].compareTo(letter[j]) > 0) {

                    String temp = letter[i];
                    letter[i] = letter[j];
                    letter[j] = temp;

                }
            }
        }

        return String.join("", letter);
    }

}
/*
char[] ch = str.toCharArray();
    String s = "";
    for (int i = 0; i < ch.length; i++){
      for (int j = i + 1; j < ch.length; j++){
        if (ch[j] < ch[i]){
          char temp = ch[i];
          ch[i] = ch[j];
          ch[j] = temp;
        }
      }
    }
        return s += String.valueOf(ch);
    }
}
 */