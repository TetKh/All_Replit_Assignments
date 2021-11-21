package InterviewCodingTasks;

public class String_WordAppearance {

    public static void main(String[] args) {

        String givenStr = "Kac defa java geceiyok ki java sayisini Javada say";
        System.out.println(wordAppearance(givenStr));

    }
    public static int wordAppearance(String str){

        String [] split = str.split(" ");
        int count = 0;

        for (String el : split) {

            if (el.toLowerCase().contains("java")){
                count++;
            }

        }
        return count;
    }
}
