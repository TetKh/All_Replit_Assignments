package InterviewCodingTasks;

public class Array_FirstUniqueElement {

    /*
    write a program that can find the first duplicated element from the array
     */

    public static void main(String[] args) {
        int[] arr = new int[]{2, 5, 6, 23, 8, 6, 1, 5, 34};
        System.out.println(firstDuplicatedElement(arr));
        System.out.println(firstDuplicatedElement2(arr));
    }

    public static int firstDuplicatedElement(int[] array) {
        int firstDuplicated = 0;

        for (int each : array) {
            int frequency = 0;
            for (int each2 : array) {
                if (each == each2)
                    frequency++;
            }

            if (frequency > 1) {
                firstDuplicated = each;
                break;
            }

        }

        return firstDuplicated;

    }

    public static int firstDuplicatedElement2(int[] array) {
        int duplicatedNum = 0;
        for(int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if(array[i] == array[j]){
                    count++;
                }
                if(count > 1) {
                    duplicatedNum = array[i];
                    break;
                }
                }
            }
        return duplicatedNum;

    }



}
