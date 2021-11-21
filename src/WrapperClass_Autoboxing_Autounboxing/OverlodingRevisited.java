package WrapperClass_Autoboxing_Autounboxing;

public class OverlodingRevisited {

    public static void main(String[] args) {

        m1(45);

        Object o = new Integer(45);
    }

//    public static void m1(int i){
//        System.out.println("int");
//    }
//    public static void m1(long i){
//        System.out.println("long");
//    }


    public static void m1(Double i){
        System.out.println("Double");
    }
    public static void m1(Long i){
        System.out.println("Long Warpper");
    }
    public static void m1(Object i){
        System.out.println("Object");
    }

//    public static void m1(int... i){
//        System.out.println("varargs");
//    }
}

