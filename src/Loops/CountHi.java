package Loops;

public class CountHi {

    public static void main(String[] args) {


        System.out.println(countHi("hi hi")); //
        System.out.println(countHi("happy")); //
        System.out.println(countHi("")); //

    }

    //Method here
    public static int countHi(String s) {

        int index = 0;
        String toFind = "hi";
        int sum = 0;

        if (s == null || s.equals("")){
            System.out.println("");
        }
        while (true) {
            index = s.indexOf(toFind, index);
            if (index != -1) {
                sum = sum + 1;
                index = index + toFind.length();
            } else {
                break;
            }
        }

        return sum;
    }
}

/*
int count = 0;
int i;

for (i = 0; i <= str.length() - toFind.length(); i++) {
String sub = str.substring(i, i + toFind.length());
if (sub.equals(toFind)){
count++
 */