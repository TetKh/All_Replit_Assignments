package Array;

public class UniqueCharacter2 {

        public static void main(String[] args) {
            uniqueCharacter("bbaabby");
            uniqueCharacter("MMMMIAMMII");
            uniqueCharacter("aa$ggbbhh");
        }
        public static void uniqueCharacter(String str) {
            int i;
            int[] count = new int[256];
            for (i = 0; i < str.length(); i++){
                char ch = str.charAt(i);
                count[ch]++;
            }
            for (i = 0; i < str.length(); i++){
                char ch1 = str.charAt(i);
                if (count[ch1] == 1) {
                    System.out.println("Unique character is: " + str.charAt(i));
                }
            }
        }
    }
