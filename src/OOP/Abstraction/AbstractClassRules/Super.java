package OOP.Abstraction.AbstractClassRules;

public abstract class Super extends Object { /// Abstract classes can extend concrete classes
  // Abstract classes can have constructors with protected visibility
    protected Super(){

    }


    public void m1(){

    }

     public abstract int method2();

     public abstract String method3();

     // Abstract methods cannot be static

    //public abstract static void method5();  //Illegal combination of modifiers: 'abstract' and 'static'

    public  String method6(){
        return "";
    }

}
