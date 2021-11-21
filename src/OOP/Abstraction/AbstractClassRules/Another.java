package OOP.Abstraction.AbstractClassRules;

public  abstract class Another  {   // final abstract ->illegal combination of modifiers: 'final' and 'abstract'
                                  // abstract classes meant to be extended so making it final results in compile error



  //  A class that contains abstract methods must be defined as abstract.
//     public abstract void m1();

     public void m2(){

         Number n = new Integer("45");
     }

    //private abstract void m3(); //Illegal combination of modifiers: 'abstract' and 'private'

    // abstract final void m3(); //Illegal combination of modifiers: 'abstract' and 'final'
}
