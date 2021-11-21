package OOP.ObjectClass;

//public class Demo extends Object
public class Demo {

    String demo = "demoValue";

//    public String toString(){
//        return "demo" + demo;
//    }


    @Override
    public String toString() {
        return "Demo{" +
                "demo='" + demo + '\'' +
                '}';
    }



    public boolean equals(Object another){

        return true;
    }
}
