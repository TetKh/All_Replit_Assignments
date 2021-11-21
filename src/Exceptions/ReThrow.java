package Exceptions;

public class ReThrow {


    public static void main(String[] args) {


        try{

            throw new ArithmeticException();
        }catch(ArithmeticException e){
            e.printStackTrace();
            // process the caught exception
            throw new NullPointerException();
        }catch(NullPointerException np){
            System.out.println("catching np");
        }
    }
}
