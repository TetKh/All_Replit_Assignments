package Overloading;

public class MethodOverloadingCall {


    public static void main(String[] args) {

        m1((byte)3);

    }

    public static  void m1(byte b){
        System.out.println("BYTE");
    }

    public static  void m1(short b){
        System.out.println("SHORT");
    }

    public static  void m1(int b){
        System.out.println("int");
    }

    public static  void m1(long b){
        System.out.println("long");
    }

    public static  void m1(float b){
        System.out.println("float");
    }

    public static  void m1(double b){
        System.out.println("double");
    }
}
