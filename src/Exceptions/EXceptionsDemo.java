public class EXceptionsDemo {


    public static void main(String[] args) {


    //  m1();

      int a = 6;
      int b = 0;
      int c = 0;
      String s = null;

      try{
          System.out.println("Before division");

         c = a/b; // ArithmeticException ex = new ArithmeticException();
          System.out.println("After a potentially exceptionally situation");
          s = "dsbhj";
      }catch(ArithmeticException e){
          System.out.println("Division by zero happened which can't be executed in Java. But the rst of the code still can execute");
          System.out.println(s);
      }

        System.out.println(c);


        System.out.println("After division");



    }


    public static void m1(){
       int [] arr = new int[5];
        System.out.println(arr[5]);
    }
}
