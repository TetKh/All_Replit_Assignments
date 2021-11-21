package InterviewCodingTasks;

public class String_CountDuplicateChars {

    public static void main(String[] args) {

        String word = "TomOrrow";
        System.out.println(countDuplicates(word));
    }

    public static String countDuplicates(String s){

        int count = 0;
        String newWord = "";
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            count = 0;
            for (int j = 0; j < s.length(); j++) {

                if (s.charAt(i) == s.charAt(j)){
                    count++;
                }

            }
            if(!newWord.contains("" + s.charAt(i))){
                newWord += s.charAt(i) + "" + count;

            }

        }
        return newWord;
    }
}
