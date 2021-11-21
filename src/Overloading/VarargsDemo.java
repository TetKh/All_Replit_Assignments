package Overloading;

public class VarargsDemo {

        public static void main(String ... args) {


            myMethod(2);
            myMethod(new int[] {5,6,7,8,9});
            myMethod(2,3);
            myMethod(new int[] {2,3});
            myMethod(3,2,3,4,5,6,6,7,7,8,8,89,9,9,90,0,0,0,0,0,0);
            myMethod(); // no arguments


        }




        public static void myMethod(int ... args){
//        System.out.println(args.length);

            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i] + " ");
            }
            System.out.println();
        }

//    public static void myMethod1(double ... args, String str){
//        System.out.println("Varargs");
//    }

        public static void myMethod1(String str, double ... args){
            System.out.println("Varargs");
        }

//    public static void myMethod1(double ... args, int ... arfds){
//        System.out.println("Varargs");
//    }
    }

