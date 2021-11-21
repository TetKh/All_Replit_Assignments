package OOP.Casting;

public class Tester {

    public static void main(String[] args) {

        Object o = new Student();  //(Object)new Student();   // Implicit casting -> upcasting

        Student st = (Student) o; // Explicit casting / downcasting


//        The compiler will not allow casts to unrelated types.

        Tomato t = new Tomato();
//        Student st2 =  (Student)t;  // Compiler error


         Object o1 = new Person();

         if(o1 instanceof Student){
             Student st2 = (Student)o1;
         }




         Person p = new Student();

        ((Student)p).id =1221;

        System.out.println(((Student)p).id);

        ((Student)p).study();











//        method1(o);
//        method1(new Student());
//        method1(new String());
//        method1(new StringBuffer());




    }




    public static void method1(Object o){

    }
}
