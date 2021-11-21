package InheritanceAndSuperKeyword;

class Computer{ // Super

    public void calculateValue(int a, int b){

        System.out.println("I can calculate " + a + " and " + b + " , which is " + (a+b));
        System.out.println("I can calculate the are of a circle: " + (Math.PI * a * a));
    }
}

class Chatbot extends Computer{ // Sub

    public void canSpeak(String language){

        System.out.println("I can speak " + language);
    }
    public void playGame(String game){

        System.out.println("I can play " + game);
    }
}

class Robot extends Chatbot{

    public void canCook(String food){

        System.out.println("I can cook " + food);
    }
}

public class Inheritancedemo {

    public static void main(String[] args) {

//        Computer c = new Computer();
//        c.calculateValue(5, 7);

//        Chatbot cb = new Chatbot();
//        cb.playGame("Chess");
//        cb.canSpeak("Japanese");
//        cb.calculateValue(4, 9);

        Robot r = new Robot();
        r.canCook("Dolma");
        r.calculateValue(5, 7);
        r.playGame("Chess");
        r.canSpeak("Spanish");
    }
}
