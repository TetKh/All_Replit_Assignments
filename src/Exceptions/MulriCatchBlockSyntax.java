package Exceptions;

public class MulriCatchBlockSyntax {


    public static void main(String[] args) {

        try{

            System.out.println(args[10]);
            System.out.println(3/0);
            System.out.println(Integer.parseInt("Hello"));
        }catch(ArithmeticException | NumberFormatException
                | NullPointerException | ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }

        System.out.println("After exception is handled");


//        try{
//
//            FileInputStream fis = new FileInputStream("dnsbg");
//        }catch( IOException | FileNotFoundException  e){  // can't put 2 classes related in hierarchy
//            e.printStackTrace();
//        }



    }
}
