package Collection.List.ArrayList;

import java.util.ArrayList;

public class SumOfPositives {

    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(-6);
        list.add(3);
        list.add(-8);
        list.add(-1);
        list.add(4);
        list.add(3);

        System.out.println(sumAppend(list)); // [4,3,4,3,14]

    }

    public static ArrayList<Integer> sumAppend(ArrayList<Integer> nums){

        int sum = 0;

        ArrayList<Integer> newNums = new ArrayList<>();

        for (int i = 0; i < nums.size(); i++) {

            if(nums.get(i) > 0){
              newNums.add(nums.get(i));
              sum += nums.get(i);
            }
        }
        newNums.add(sum);

        return newNums;
    }
}
