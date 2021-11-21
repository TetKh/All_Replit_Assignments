package OOP.Abstraction.AbstractClassRules;

public abstract class Sub extends Super{

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }

     public abstract String method6();  // non-abstract methods can also be overridden with abstract methods
                                         // which is rare but possible


    public abstract  void method4();

}
