package Array;

public class FrequencyOfCharacters {

        public static void main(String[] args) {

            // Ex: "AABCBCA"  ==> "A3B2C2"

            String str = "AABCBCA";

            int [] counter = new int[256];

            for (int i = 0; i < str.length(); i++) {
                counter[str.charAt(i)]++;
            }
            for (int i = 0; i < 256; i++) {
                if (counter[i] != 0) {
                    System.out.print((char) i + "" + counter[i]);
                }
            }
        }
    }

