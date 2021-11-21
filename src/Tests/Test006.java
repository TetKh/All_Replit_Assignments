package Tests;


public class Test006 {


    public static void main(String[] args) {

        convertToDouble("$21.98");
//        System.out.println(convertToDouble("$1,220.02"));
//        System.out.println(convertToDouble("$1.99"));
//        System.out.println(convertToDouble("$101,100.50"));



    }

    public static void convertToDouble(String str) {

        str = str.substring(1).replace(",", "").replace(".", "");

        System.out.println(Integer.parseInt(str));
    }

}