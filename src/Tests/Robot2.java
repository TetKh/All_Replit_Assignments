package Tests;

public class Robot2 extends SuperRobot{

    public Robot2(){

        System.out.println("I can cook");
    }
    public Robot2(String chess){
        super(chess);

        System.out.println("I can play " + chess);
    }
}
