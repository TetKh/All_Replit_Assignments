package Collection.List.ArrayList;

import java.util.ArrayList;

public class RepeatTwice {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(9);

        System.out.println(makeTwo(list)); // [4,4,5,5,6,6]

    }


    public static ArrayList<Integer> makeTwo(ArrayList<Integer> nums) {

        ArrayList<Integer> newList = new ArrayList<>(nums);


        for (int i = 0; i < nums.size()*2; i++) {
            newList.add(i, newList.get(i));
            i++;

        }
        return newList;
    }
}