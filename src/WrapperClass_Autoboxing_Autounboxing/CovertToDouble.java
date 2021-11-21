package WrapperClass_Autoboxing_Autounboxing;

public class CovertToDouble {

    public static void main(String[] args) {
        //TEST
        System.out.println(convertToDouble("$21.98"));
        System.out.println(convertToDouble("$1,220.02"));
        System.out.println(convertToDouble("$1.99"));
        System.out.println(convertToDouble("$101,100.50"));
    }


    //Create your method here

    public static double convertToDouble(String str){

        String price = str.substring(1).replace(",", "");

        return Double.parseDouble(price);


    }
}
