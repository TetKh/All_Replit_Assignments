package Exceptions;

public class ThrowingException {


    public static void main(String[] args) {
        reverse("scbhdbchs");

        reverse("dsghvcsd");
    }



    public static void reverse(String str){

        if(str == null) {
            StringNotNullException e = new StringNotNullException("Null is not allowed");
            throw e;

            // throw new StringNotNullException("Null is not allowed");;
        }
    }
}
