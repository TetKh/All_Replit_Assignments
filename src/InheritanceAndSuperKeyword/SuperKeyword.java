package InheritanceAndSuperKeyword;

class Robot1{

    public Robot1(){

        System.out.println("I can speak Spanish");
    }
    public Robot1(String language){

        System.out.println("I can speak Spanish and " + language);
    }
}
class Robot2 extends Robot1{

    public Robot2(){

        System.out.println("I can cook Pizza");
    }
    public Robot2(String food){

        super("Japanese");
        System.out.println("I can cook Pizza and " + food);
    }
}

public class SuperKeyword {

    public static void main(String[] args) {

        Robot2 r2 = new Robot2("Dolma");
    }
}
