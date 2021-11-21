package Loops;

public class FindFirstDublicateChar {

    public static void main(String[] args) {

        dublicate("avcdeav");


    }

        public static void dublicate(String str) {

            int i = 0;
            int j = 0;


            outter: for (i = 0; i < str.length()-1; i++) {
                inner: for (j = i + 1; j < str.length(); j++)

                    if (str.charAt(i) == str.charAt(j)) {
                        System.out.println(str.charAt(i));
                        break outter;
                    }
            }
        }
}

