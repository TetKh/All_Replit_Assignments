package Array;

import java.util.Arrays;

public class CombinedArrays {

    public static void main(String[] args){
        String [] arr1 = new String[] {"bob","joe","rob"};
        String [] arr2 = new String[] {"jones","smith","paul"};

        System.out.println(Arrays.toString(combineNames(arr1, arr2)));

        System.out.println(Arrays.toString( combineNames(new String[] {"Barack","Kamala"} , new String[] {"Obama","Harris"}))); // -> ["Barack Obama", "Kamala Harris"]
        System.out.println(Arrays.toString( combineNames(new String[] {"Hey","What's up"} , new String[] {"Yo","Man"}))); // -> ["Hey Yo", "What's up Man "]
    }



    public static String[] combineNames(String[] first, String[] second){

        String ret[] = new String [first.length];  // Create a new array that is equal to the size of other arrays

        for (int i = 0; i < ret.length; i++) {

            ret [i] =  first[i] + " " + second[i];

        }
        return ret;
    }

}
