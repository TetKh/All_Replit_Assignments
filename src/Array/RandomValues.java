package Array;

public class RandomValues {


        public static void main(String[] args) {

//        boolean [] arr = new boolean[1000];
//
//        System.out.println(Arrays.toString(arr));  //all false

            int[] arr = new int[1000];

//        System.out.println(Arrays.toString(arr));


            for (int i = 0; i < arr.length; i++) {
                arr[i] = 1 + (int) (Math.random() * 100);

            }
//        System.out.println(Arrays.toString(arr));


            int sum = 0;
            for (int i = 1; i < arr.length; i++) {

//            if(i % 25== 0){
//                System.out.println(arr[i]);
//            }else{
//                System.out.print(arr[i] + "\t");
//            }

                if (arr[i] % 7 == 0 && arr[i] % 5 == 0) {
                    System.out.println(arr[i]);
                    sum += arr[i];
                }


            }

            System.out.println();
            System.out.println(sum);

        }
    }

