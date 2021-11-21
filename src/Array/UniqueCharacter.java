package Array;

public class UniqueCharacter {

        public static void main(String[] args) {

            String str = "AJABBPP@OOZCC";

            for (char ch : str.toCharArray()) {
                if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                    System.out.println(ch);
                }
            }
        }
}

    /*
    char ch [] = str.toCharArray();

            for (int i = 0; i < ch.length; i++) {
                if (str.indexOf(ch[i]) == str.lastIndexOf(ch[i])) {
                    System.out.println(ch[i]);
                }
            }
        }
    }
     */