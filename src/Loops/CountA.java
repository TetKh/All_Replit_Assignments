package Loops;

public class CountA {

    public static void main(String[] args){
        System.out.println(countA("aaA")); //3
        System.out.println(countA("aaBBdf8k3AAadnklA")); //6
    }

    //Write your method here

    public static int countA(String s){

        char a = 'A';
        char a2 = 'a';

        int sum = 0;

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == a || s.charAt(i) == a2)
                sum++;
        }
        return sum;
    }
}

