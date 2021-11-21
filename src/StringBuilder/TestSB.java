package StringBuilder;

public class TestSB {

    public static void main(String[] args) {


        String str = "dsnbc";

        StringBuilder sb = new StringBuilder("dsnbc");
        StringBuilder sb1 = new StringBuilder("dsnbc");


//        System.out.println(5 == true);  // compiler error

        System.out.println(str.equals(sb));  //false


        System.out.println(sb == sb1);  //false
        System.out.println(sb.equals(sb1));  //false
    }
}
