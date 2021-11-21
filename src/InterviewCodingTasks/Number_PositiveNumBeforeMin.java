package InterviewCodingTasks;

public class Number_PositiveNumBeforeMin {

    public static void main(String[] args) {
        int [] array = new int[]{-3, -1, -2, 0, 4, 7, 9, 3, 12};
        System.out.println(findPosNum(array));
    }


    public static int findPosNum(int[] arr) {
        int posNumBeforeMin = Integer.MAX_VALUE;
        for (int i = 0; i< arr.length; i++){
                if (arr[i] < posNumBeforeMin && arr[i] >= 0){
                    posNumBeforeMin = arr[i];
            }
        }

    return posNumBeforeMin == 0 ? posNumBeforeMin : posNumBeforeMin-1;
    }
}