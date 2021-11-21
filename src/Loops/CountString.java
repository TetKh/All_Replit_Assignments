package Loops;

public class CountString {

    public static void main(String[] args){
        //Tests
        System.out.println(countString("crazy crayfish crushing craniums", "cra"));  //3
        System.out.println(countString("sometimes solutions dont come on time", "me")); //4
        System.out.println(countString("sometimes solutions dont come on time", "on")); //3
        System.out.println(countString("yoyoyoyoyoyoyoyoyoyoyoyoyoyoyoy", "yo")); //15
        System.out.println(countString("Talk is cheap. Show me the code", "code")); // 1
        System.out.println(countString("Talk is cheap. Show me the code", "a")); // 2
    }

    public static int countString(String str, String toFind){

        int index = 0;
        int count = 0;

        while (true) {
            index = str.indexOf(toFind, index); // from toFind to FROM SOME NUMBER
            if (index != -1) {
                count ++;
                index += toFind.length();
            } else {
                break;
            }
        }

        return count;
    }
}