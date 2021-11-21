package InterviewCodingTasks;

public class Number_Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibonacci(12));
    }

    public static int fibonacci(int num) {

        int result = 0;
        int j = 0;
        int z = 1;

        for (int i = 1; i < num; i++) {
            result = j + z;
            j = z;
            z = result;
        }

        return result;
    }


}
