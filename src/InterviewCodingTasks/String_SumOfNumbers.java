package InterviewCodingTasks;

public class String_SumOfNumbers {

    public static void main(String[] args) {

        String str = "jav45ai15gd8hr1at92";
        System.out.println(sumOfNumbers(str));

    }
    public static int sumOfNumbers(String s){

        int sum = 0;
        String [] nums = s.split("[A-Za-z]");

        for (String num : nums) {
            if (!num.isEmpty())
                sum += Integer.parseInt(num);
        }

        return sum;
    }
}
