package Loops;

    public class Class_LoopDemo {

        public static void main(String[] args) {


            int counter = 0;

//        if(counter<100){
//            System.out.println("Welcome to Miami!");
//        }
            int actual = 0;
            while (counter < 100) {
                System.out.print(counter + ". Welcome to Miami!");
                counter += 2; // increment
                actual++;
                System.out.println(" " + actual);
            }
        }
    }


//        while(true) // curly braces can be omitted if there is only one statement
//            System.out.println("Hello");  // infinite loop
