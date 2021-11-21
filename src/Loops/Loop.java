package Loops;

public class Loop {


    public static void main(String[] args) {
        printMessage("Hello" , 5);

    }


    public static void printMessage(String word, int count) {


        int num = 0;
        while(num < count){

            System.out.println(word);
            num++;
        }

    }

}


