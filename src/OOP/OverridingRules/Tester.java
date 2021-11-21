package OOP.OverridingRules;

public class Tester {

    public static void main(String[] args) {


        Super s =new Super();

        Sub s1 = new Sub();

        Sub.m2();

        Sub.m3();


        Sub sub = new Sub();

        System.out.println(sub.str);

        System.out.println(Sub.i);
        System.out.println(Super.i);



    }


}
