package InterviewCodingTasks;

public class Number_IfArmstrong {

    public static void main(String[] args) {
        System.out.println(ifArmstrong(153));
        System.out.println(ifArmstrong(157));
    }

    public static boolean ifArmstrong(int num){
        String [] str = String.valueOf(num).split("");
        int result = 0;
        for (String e : str){
            double i = Math.pow(Double.parseDouble(e), 3);
            result += i;
        }
        return result == num;
    }
}
