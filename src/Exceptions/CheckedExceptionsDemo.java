package Exceptions;

public class CheckedExceptionsDemo {


    public static void main(String[] args) {

        // Checked exceptions are exceptions that must be handled, otherwise compiler will not compile the code
        try {
            Thread.sleep(2000);


        }catch(InterruptedException e){

        }

        System.out.println(6/1);
     // Exception class and its subclasses except RuntimeException are checked exceptions
    //RuntimeException and its subclasses and Error class and its subclasses are unchecked exceptions.


    }
}
