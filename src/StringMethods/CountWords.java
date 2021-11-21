package StringMethods;

public class CountWords {

    public static void main(String[] args) {

        System.out.println(countWords("Just an example here move along"));
        System.out.println(countWords("This is a test"));
        System.out.println(countWords("What an easy task, right"));
        System.out.println(countWords("What"));
        System.out.println(countWords("What else?"));

        }


    public static int countWords(String sentence) {

        int one = sentence.indexOf(" ");
        int two = sentence.indexOf(" ", one + 1);
        int three = sentence.indexOf(" ", two + 1);
        int four = sentence.indexOf(" ", three + 1);
        int five = sentence.indexOf(" ", four + 1);

        if (one < 0) {
            return 1;

        } if (two < 0) {
            return 2;
        }
        if (three < 0) {
            return 3;
        }
        if (four < 0) {
            return 4;
        }
        if (five < 0) {
            return 5;

        } else {
            return 6;

            // countWords(sentence);
        }

    }
}
